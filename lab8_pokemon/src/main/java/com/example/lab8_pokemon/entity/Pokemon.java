package com.example.lab8_pokemon.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pokemon {
    private int id;
    private String namePokemon;
    private int height;
    private int weight;
    private String location_area;
    private User user;


}
