package com.buggyrjh.projectmanager.service;

import com.buggyrjh.projectmanager.dao.companies.CompanyDao;
import com.buggyrjh.projectmanager.model.Company;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class CompanyService {
    private final CompanyDao companyDao;

    @Autowired
    public CompanyService(@Qualifier("postgres") CompanyDao companyDao) {
        this.companyDao = companyDao;
    }
    public int set(Company company) {
        return companyDao.addCompany(company);
    }
    public Company select(UUID id) {
        return companyDao.select(id);
    }
    public List<Company> selectAll() {
        companyDao.selectAll();
    }
    public void delete(UUID id) {
        companyDao.delete(id);
    }
    public void update(UUID id, Company company) {
        companyDao.update(id, company);
    }
}
