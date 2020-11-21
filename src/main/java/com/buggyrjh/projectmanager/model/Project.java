package com.buggyrjh.projectmanager.model;


import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@Table(name="projects")
public class Project {
    @Id
    private Long id;
    private String name;

    @ManyToOne
    private Company company;
    @OneToMany(mappedBy = "id")
    private Set<Task> tasks;
    @OneToMany(mappedBy = "id")
    private Set<User> users;
}