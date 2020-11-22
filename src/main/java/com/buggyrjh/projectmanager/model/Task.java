package com.buggyrjh.projectmanager.model;
import java.util.UUID;

public class Task {

    // ##### Initiate member variables ##### //
    private String name, description;

            // ### Map to ORM SQL ### //
    private UUID id;
    private User user;
    private Project project;

                    // ##### Constructor empty and full ##### //
    public Task() {}
    public Task(UUID id, String name, String description, User user) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.user = user;
    }
                    // ##### Setters ##### //
    public void setDescription(String description) { this.description = description; }
    public void setProject(Project project) { this.project = project; }
    public void setName(String name) { this.name = name; }
    public void setUser(User user) { this.user = user; }
    public void setId(UUID id) { this.id = id; }

                    // ##### Getters ##### //
    public String getDescription() { return description; }
    public Project getProject() { return project; }
    public String getName() { return name; }
    public User getUser() { return user; }
    public UUID getId() { return id; }
}