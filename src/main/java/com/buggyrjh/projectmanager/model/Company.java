package com.buggyrjh.projectmanager.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@Table(name= "companies")
public class Company {
    @Id
    private Long id;

    private Long adminUser;
    private String name;

//    @OneToMany(mappedBy = "id")
//    private Set<User> users;
    @OneToMany(mappedBy = "id")
    private Set<Project> projects;

//    public Company(Long id, Long adminUser, String name) {
//        this.id = id;
//        this.adminUser = adminUser;
//        this.name = name;
//    }
//    public void setAdminUser(Long adminUser) { this.adminUser = adminUser; }
//    public void setName(String name) { this.name = name; }
//
//    public void setId(Long id) { this.id = id; }
//    public Long getAdminUser() { return adminUser; }
//    public String getName() { return name; }
//
//    public Long getId() { return id; }
}
