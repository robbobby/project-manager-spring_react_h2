package com.buggyrjh.projectmanager.repository;

import com.buggyrjh.projectmanager.model.Company;
import jdk.jfr.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Company, Long> {
    Category findByName(String name);
}
