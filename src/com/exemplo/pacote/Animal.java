package com.exemplo.pacote;

public class Animal {
    private String nome;

    public String getNome() {
        return nome;
    }

    protected void fazerSom() {
        System.out.println("som do animal");
    }
    public void setNome(String nome){
        this.nome = nome;
    }
}
