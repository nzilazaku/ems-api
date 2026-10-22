package com.ems.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.engine.internal.Cascade;

import java.lang.reflect.Array;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "employee_table")
public class Employee {
    //The Employee number must be random because o the id of ech of them
    @Id
    @Column(name = "emp_id")
    private Long id;
    @Column(name = "emp_name", nullable = false)
    private String name;
    @Column(name = "emp_gender", nullable = false)
    private String gender;
    @Column(name = "emp_age", nullable = false)
    private int age;
    @Column(name = "emp_designation", nullable = false)
    private String designation;
    @Column(name = "emp_dep", nullable = false)
    private String department;
    @Column(name = "emp_salary", nullable = false)
    private double salary;
    @Column(name = "emp_username", nullable = false, unique = true)
    private String username;
    @Column(name = "emp_email", nullable = false, unique = true)
    private String email;
    @Column(name = "emp_password", nullable = false)
    private String password;
    @Column(name = "emp_contact", nullable = false, unique = true)
    private String contact;

    //Relations | OneToMany
    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<Leave> leaves;
    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<Duty> duties;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "manager_id")
    private Manager manager;
}
