package com.buggyrjh.projectmanager.controllers;

import com.buggyrjh.projectmanager.model.Company;
import com.buggyrjh.projectmanager.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("api-test/company")
public class CompanyController {
    private final CompanyService companyService;

    @Autowired
    CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }
    @PostMapping
    public int add(@RequestBody Company company) {
        return companyService.set(company);
    }
    @GetMapping
    public List<Company> getAllCompanies() {
        return companyService.selectAll();
    }
    @GetMapping(path="{id}")
    public Company get(@PathVariable UUID id) {
        return companyService.select(id);
    }
    @DeleteMapping(path="{id}")
    public void delete(@PathVariable UUID id) {
        companyService.delete(id);
    }
    @PutMapping(path="{id}")
    public void update(@PathVariable UUID id, @RequestBody Company company) {
        companyService.update(id, company);
    }
}