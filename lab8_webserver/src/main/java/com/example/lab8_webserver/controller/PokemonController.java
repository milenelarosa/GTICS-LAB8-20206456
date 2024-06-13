package com.example.lab8_webserver.controller;

import com.example.lab8_webserver.entity.Pokemon;
import com.example.lab8_webserver.repository.PokemonRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/pokemon")
public class PokemonController {

    final PokemonRepository pokemonRepository;


    public PokemonController(PokemonRepository pokemonRepository) {
        this.pokemonRepository = pokemonRepository;
    }

    @GetMapping("")
    public List<Pokemon> listar() {
        return pokemonRepository.findAll();
    }
}
