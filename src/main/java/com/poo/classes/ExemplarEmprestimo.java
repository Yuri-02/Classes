package com.poo.classes;

public class ExemplarEmprestimo {
    private int id;
    private Exemplar exemplar;
    private Emprestimo emprestimo;
    private Devolucao devolucao;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public Exemplar getExemplar(){
        return exemplar;
    }

    public void setExemplar(Exemplar exemplar){
        this.exemplar = exemplar;
    }

    public Emprestimo getEmprestimo(){
        return emprestimo;
    }

    public void setEmprestimo(Emprestimo emprestimo){
        this.emprestimo = emprestimo;
    }

    public Devolucao getDevolucao(){
        return devolucao;
    }

    public void setDevolucao(Devolucao devolucao){
        this.devolucao = devolucao;
    }
}
