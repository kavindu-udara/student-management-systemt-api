package com.example.demo.model;

import jakarta.persistence.*;
import lombok.*;

@Entity

@Table(name = "students")

@Data

@AllArgsConstructor

@NoArgsConstructor

public class Student {
    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;

    @Column(name = "first_name", nullable = false)
    private String firstName;

    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "department", nullable = false)
    private String department;

    @Column(name = "year_of_enrollment")
    private int yearOfEnrollment;

}
