package com.example.lab8_webserver.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "pokemon")
@Getter
@Setter
public class Pokemon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpokemon", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false, length = 45)
    private String namePokemon;

    @Column(name = "height")
    private Integer height;

    @Column(name = "weight")
    private Integer weight;

    @Column(name = "location_area", nullable = false, length = 100)
    private String location_area;

    @ManyToOne
    @JoinColumn(name = "user_iduser")
    private User user;
}
