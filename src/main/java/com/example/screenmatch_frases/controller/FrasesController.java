package com.example.screenmatch_frases.controller;

import com.example.screenmatch_frases.dto.FrasesDTO;
import com.example.screenmatch_frases.service.FrasesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrasesController {

    @Autowired
    private FrasesService frasesService;

    @GetMapping("/series/frases")
    public FrasesDTO obtenerFraseAleatoria(){
        return frasesService.obtenerFraseAleatoria();
    }
}