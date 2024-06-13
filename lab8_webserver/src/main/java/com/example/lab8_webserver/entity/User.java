package com.example.lab8_webserver.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "user")
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "iduser", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false, length = 45)
    private String nameUser;

    @Column(name = "age")
    private Integer age;


}
