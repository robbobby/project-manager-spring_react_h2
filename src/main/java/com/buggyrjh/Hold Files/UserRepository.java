package com.buggyrjh.projectmanager.repository;

import com.buggyrjh.projectmanager.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
