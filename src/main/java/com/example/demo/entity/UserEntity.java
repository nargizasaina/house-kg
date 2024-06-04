package com.example.demo.entity;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "users")
public class UserEntity extends BaseEntity{
    @Column(name = "username", unique = true, nullable = false)
    private String username;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "date_create")
    private LocalDateTime dateCreate;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "m2m_users_roles",
    joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id")
    )
    private Set<RoleEntity> roles;

    @PrePersist
    public void dateCreate() {
        this.dateCreate = LocalDateTime.now();
    }
}
