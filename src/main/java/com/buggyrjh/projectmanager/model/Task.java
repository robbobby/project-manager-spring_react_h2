package com.buggyrjh.projectmanager.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@Table(name= "tasks")
public class Task {
    @Id
    private Long id;
    private String name, description;

    @ManyToOne
    private User user;
    @ManyToOne
    private Project project;


    public Task(Long id, String name, String description, User user) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.user = user;
    }
}