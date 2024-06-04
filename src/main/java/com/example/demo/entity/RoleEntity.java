package com.example.demo.entity;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "roles")
public class RoleEntity extends BaseEntity{
    @Column(name = "title", unique = true, nullable = false)
    private String roleName;

    @ManyToMany(mappedBy = "roles", fetch = FetchType.EAGER)
    private Set<UserEntity> users;
}
