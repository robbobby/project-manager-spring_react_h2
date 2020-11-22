package com.buggyrjh.projectmanager.model;
import javax.persistence.*;
import java.util.Set;

public class Project {
    // ##### Initiate member variables ##### //
    @Id
    private Long id;
    private String name;

    // ### Map to ORM SQL ### //
    private Company company;
    private Set<Task> tasks;
    private Set<User> users;

                    // ##### Constructor empty and full ##### //
    public Project() {}
    public Project(Long id, String name, Company company, Set<Task> tasks, Set<User> users) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.tasks = tasks;
        this.users = users;
    }
                        // ##### Setters ##### //
    public void setCompany(Company company) { this.company = company; }
    public void setTasks(Set<Task> tasks) { this.tasks = tasks; }
    public void setUsers(Set<User> users) { this.users = users; }
    public void setName(String name) { this.name = name; }
    public void setId(Long id) { this.id = id; }

                        // ##### Getters ##### //
    public Company getCompany() { return company; }
    public Set<Task> getTasks() { return tasks; }
    public Set<User> getUsers() { return users; }
    public String getName() { return name; }
    public Long getId() { return id; }
}