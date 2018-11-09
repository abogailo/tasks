package com.hudson.tasks.service;

import com.hudson.tasks.domain.Task;
import org.springframework.stereotype.Service;
import com.hudson.tasks.repository.TaskRepository;

@Service
public class TaskServiceImpl implements TaskService{

    private TaskRepository taskRepository;

    public TaskServiceImpl(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }

    @Override
    public Iterable<Task> list() {
        return this.taskRepository.findAll();
    }

    @Override
    public Task save(Task task){
        return this.taskRepository.save(task);
    }
}
