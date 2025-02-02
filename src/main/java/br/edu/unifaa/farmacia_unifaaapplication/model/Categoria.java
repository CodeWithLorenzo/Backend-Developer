package br.edu.unifaa.farmacia_unifaaapplication.model;

public class Categoria {
    private long id;
    private String nome;

    // Construtores, Getters e Setters
    public Categoria() {
    }

    public Categoria(long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
