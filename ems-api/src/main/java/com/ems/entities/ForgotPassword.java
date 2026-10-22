package com.ems.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ForgotPassword {

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String newPassword;



}
