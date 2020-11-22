package com.buggyrjh.projectmanager.dao.companies;

import com.buggyrjh.projectmanager.model.Company;

import java.util.List;
import java.util.UUID;

public interface CompanyDao {
    List<Company> insertCompany(Company company);

    int addCompany(Company company);

    void selectAll();

    Company select(UUID id);

    void delete(UUID id);

    void update(UUID id, Company company);
}
