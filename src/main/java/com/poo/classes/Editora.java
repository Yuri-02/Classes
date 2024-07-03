package com.poo.classes;

public class Editora {
    private static int contador = 1;
    
    private int id;
    private String nome;
    

    public Editora(String nome){
        this.nome = nome;
        this.id = contador;
        contador++;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
}
