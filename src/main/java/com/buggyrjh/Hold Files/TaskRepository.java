package com.buggyrjh.projectmanager.repository;

import com.buggyrjh.projectmanager.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
