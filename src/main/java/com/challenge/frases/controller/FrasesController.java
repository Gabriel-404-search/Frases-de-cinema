package com.challenge.frases.controller;

import com.challenge.frases.entity.Frases;
import com.challenge.frases.services.FrasesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/series")
public class FrasesController {

    @Autowired
    FrasesService service;

    @GetMapping("/frases")
    public Frases obterFraseAleatoriaf() {
        return service.encontreUmaFrase();
    }

    @DeleteMapping("/delete/{id}")
    public void testeDelete(@PathVariable("id") Long id) {
        service.deleta(id);
    }

    @PostMapping("/frases/criar")
    public void criarNovaFrase(@RequestBody Frases frases) {
        service.salva(frases);
    }
    @PutMapping("/atualizar")
    public void testeAtualiza(String poster){
        poster = "https://miro.medium.com/v2/resize:fit:760/1*kqGUAqKI1k8ogK-RyT4khg.jpeg";
        service.atualiza(56L, poster);
    }

}
