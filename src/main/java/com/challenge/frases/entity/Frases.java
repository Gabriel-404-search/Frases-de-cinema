package com.challenge.frases.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "frases")
public class Frases {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String personagem;
    private String titulo;
    private String frase;
    private String poster;

    public Frases() {
        this.id = getId();
        this.personagem = getPersonagem();
        this.titulo = getTitulo();
        this.frase = getFrase();
        this.poster = getPoster();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPersonagem() {
        return personagem;
    }

    public void setPersonagem(String personagem) {
        this.personagem = personagem;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public String getPoster() {
        return poster;
    }

    public void setPoster(String poster) {
        this.poster = poster;
    }
}
