package com.example.lab8_pokemon.controller;

import com.example.lab8_pokemon.dao.PokemonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/pokemon")
public class PokemonController {

    @Autowired
    PokemonDao pokemonDao;

    @GetMapping({"/list", "", "/"})
    public String listarPokemones(Model model) {
        model.addAttribute("listaPokemones", pokemonDao.listarPokemones());
        return "list";
    }

}
