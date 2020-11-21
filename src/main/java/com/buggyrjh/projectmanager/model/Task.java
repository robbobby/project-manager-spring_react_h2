package com.buggyrjh.projectmanager.model;

import javax.persistence.*;
import java.util.Set;

@Entity
//@Table(name='task')
public class Task {
    @Id
    private Long id;
    private String name, description;

    @OneToMany
    private Set<User> users;
    @ManyToOne
    private Project project;


    public Task(Long id, String name, String description, Set<User> users) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.users = users;
    }

    public Task() {
    }
}
