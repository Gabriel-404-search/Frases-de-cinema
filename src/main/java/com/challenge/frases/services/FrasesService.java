package com.challenge.frases.services;

import com.challenge.frases.dto.FrasesDTO;
import com.challenge.frases.entity.Frases;
import com.challenge.frases.mapper.FrasesMapper;
import com.challenge.frases.repository.FrasesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FrasesService {

    @Autowired
    FrasesRepository repository;

    public void salva(Frases frases) {
        repository.save(frases);
    }

    public Frases encontreUmaFrase(){
        List<Frases> frasesList = (repository.findAll());
        int sorteio = (int) (Math.random() * frasesList.size());
        return (frasesList.get(sorteio));
    }

    public FrasesDTO leia(String personagem){
        return FrasesMapper.toDto(repository.findByPersonagemContainingIgnoreCase(personagem));
    }

    public void atualiza(Long id, String poster){
        Optional<Frases> frase = repository.findById(id);
        frase.ifPresent(f->{
            f.setPoster(poster);
            repository.save(f);
        });
    }

    public void deleta(Long id){
        repository.deleteById(id);
    }

}