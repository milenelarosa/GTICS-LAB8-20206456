package com.example.lab8_pokemon.dao;

import com.example.lab8_pokemon.entity.Pokemon;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Component
public class PokemonDao {

    public List<Pokemon> listarPokemones() {
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Pokemon[]> response = restTemplate.getForEntity(
                "http://localhost:8080/pokemon", Pokemon[].class);

        return Arrays.asList(response.getBody());
    }
}
