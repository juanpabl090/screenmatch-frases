package com.example.screenmatch_frases.service;

import com.example.screenmatch_frases.dto.FrasesDTO;
import com.example.screenmatch_frases.model.Frase;
import com.example.screenmatch_frases.repository.FraseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FrasesService {

    @Autowired
    private FraseRepository fraseRepository;

    public FrasesDTO obtenerFraseAleatoria() {
        Frase frase = fraseRepository.obtenerFraseAleatoria();
        return new FrasesDTO(frase.getId(), frase.getTitulo(), frase.getFrase(), frase.getPersonaje(), frase.getPoster());
    }
}