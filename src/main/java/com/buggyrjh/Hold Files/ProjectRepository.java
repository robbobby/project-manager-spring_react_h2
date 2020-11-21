package com.buggyrjh.projectmanager.repository;

import com.buggyrjh.projectmanager.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {

}
