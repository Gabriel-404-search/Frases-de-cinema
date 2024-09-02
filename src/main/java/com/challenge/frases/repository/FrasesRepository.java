package com.challenge.frases.repository;

import com.challenge.frases.entity.Frases;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FrasesRepository extends JpaRepository<Frases, Long> {
    Frases findByPersonagemContainingIgnoreCase(String personagem);
}
