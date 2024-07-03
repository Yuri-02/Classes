package com.poo.classes;

public class Livro {
    private static int contador = 1;
    
    private int id;
    private int edicao;
    private String titulo;
    private int ano;
    private Autor autor;
    private String categoria;
    private Editora editora;
    

    public Livro(int edicao, String titulo, int ano, Autor autor, String categoria, Editora editora){
        this.edicao = edicao;
        this.titulo = titulo;
        this.ano = ano;
        this.autor = autor;
        this.categoria = categoria;
        this.editora = editora;
        this.id = contador;
        contador++;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getEdicao(){
        return edicao;
    }

    public void setEdicao(int edicao){
        this.edicao = edicao;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public int getAno(){
        return ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    public Autor getAutor(){
        return autor;
    }

    public void setAutor(Autor autor){
        this.autor = autor;
    }

    public String getCategoria(){
        return categoria;
    }

    public void setCategoria(String categoria){
        this.categoria = categoria;
    }

    public Editora getEditora(){
        return editora;
    }

    public void setEditora(Editora editora){
        this.editora = editora;
    }
}
