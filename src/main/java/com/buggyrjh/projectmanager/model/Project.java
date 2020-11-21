package com.buggyrjh.projectmanager.model;


import javax.persistence.*;
import java.util.Set;

@Entity
//@Table(name = 'projects')
public class Project {
    @Id
    private Long id;
    private String name;

    @ManyToOne
    private Company company;
    @OneToMany
    private Set<Task> tasks;
    @OneToMany
    private Set<User> users;

}
