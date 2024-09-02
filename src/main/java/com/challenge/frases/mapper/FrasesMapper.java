package com.challenge.frases.mapper;

import com.challenge.frases.dto.FrasesDTO;
import com.challenge.frases.entity.Frases;

public class FrasesMapper {

    public static FrasesDTO toDto(Frases frases){
        return new FrasesDTO(frases.getPersonagem(), frases.getPoster(), frases.getTitulo(), frases.getFrase());
    }
    public static Frases toFrases(FrasesDTO frasesDTO){
        Frases frases = new Frases();
        frases.setFrase(frasesDTO.frase());
        frases.setPersonagem(frasesDTO.personagem());
        frases.setPoster(frasesDTO.poster());
        frases.setTitulo(frasesDTO.titulo());
        return frases;
    }
}
