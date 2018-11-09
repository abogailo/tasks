package com.hudson.tasks.repository;

import com.hudson.tasks.domain.Task;
import org.springframework.data.repository.CrudRepository;

public interface TaskRepository extends CrudRepository<Task, Long> {



}
