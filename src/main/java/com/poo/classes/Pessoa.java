package com.poo.classes;


public class Pessoa {
    private static int contador = 1;
    
    private int id;
    private String nome;
    private String rg;
    private String cpf;
    private Endereco endereco;
    


    // Cosntrutores
    public Pessoa(String nome, String cpf, Endereco endereco){
        this.nome = nome;
        setCpf(cpf);
        this.endereco = endereco;
        this.id = contador;
        contador++;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String setNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getRg(){
        return rg;
    }

    public void setRg(String rg){
        this.rg = rg;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public Endereco getEndereco(){
        return endereco;
    }

    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }
}
