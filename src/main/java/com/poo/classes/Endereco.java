package com.poo.classes;

public class Endereco {
    private static int contador = 1;
    
    private int id;
    private String tipo;
    private String logradouro;
    private String complemento;
    private String cidade;
    private String uf;
    private String cep;
    

    public Endereco(String cep){
        this.cep = cep;
        this.id = contador;
        contador++;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getTipo(){
        return tipo;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public String getLogradouro(){
        return logradouro;
    }

    public void setLogradouro(String logradouro){
        this.logradouro = logradouro;
    }

    public String getComplemento(){
        return complemento;
    }

    public void setComplemento(String complemento){
        this.complemento = complemento;
    }

    public String getCidade(){
        return cidade;
    }

    public void setCidade(String cidade){
        this.cidade = cidade;
    }

    public String getUf(){
        return uf;
    }

    public void setUf(String uf){
        this.uf = uf;
    }

    public String getCep(){
        return cep;
    }

    public void setCep(String cep){
        this.cep = cep;
    }

}
