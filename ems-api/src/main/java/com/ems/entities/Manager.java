package com.ems.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "manager_table")
public class Manager {

    @Id
    @Column(name =" manager_id")
    private Long id;
    @Column(name = "manager_name", nullable = false)
    private String name;
    @Column(name = "manager_username", nullable = false, unique = true)
    private String username;
    @Column(name = "manager_email", nullable = false, unique = true)
    private String email;
    @Column(name = "manager_password", nullable = false)
    private String password;
    @Column(name = "manager_department", nullable = false)
    private String department;
    @Column(name = "manager_contact", nullable = false, unique = true)
    private String contact;

    @OneToMany(mappedBy = "manager", cascade = CascadeType.ALL)
    private List<Employee> employees;
    @OneToMany(mappedBy = "assignedByManager", cascade = CascadeType.ALL)
    private List<Duty> dutiesAssigned;


}
