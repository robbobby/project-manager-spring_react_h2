package com.buggyrjh.projectmanager.model;

import java.util.Set;
import java.util.UUID;

public class Company {

            // ##### Initiate member variables ##### //
    private Long adminUser;
    private String name;

                    // ### Map to ORM SQL ### //
    private UUID id;
    private Set<User> users;
    private Set<Project> projects;

            // ##### Constructor empty and full ##### //
    public Company() {}
    public Company(UUID id, Long adminUser, String name) {
        this.id = id;
        this.adminUser = adminUser;
        this.name = name;
    }
    // ##### Getters ##### //
    public void setAdminUser(Long adminUser) { this.adminUser = adminUser; }
    public void setName(String name) { this.name = name; }
    public void setId(UUID id) { this.id = id; }

                // ##### Setters ##### //
    public Long getAdminUser() { return adminUser; }
    public String getName() { return name; }
    public UUID getId() { return id; }

}
