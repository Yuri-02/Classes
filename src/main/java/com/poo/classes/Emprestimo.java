package com.poo.classes;

import java.time.LocalDate;

public class Emprestimo {
    private int id;
    private LocalDate dataEmprestimo;
    private LocalDate dataPrevisaoDevolucao;
    private Pessoa cliente;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public LocalDate getDataEmprestimo(){
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo){
        this.dataEmprestimo = dataEmprestimo;
    }

    public LocalDate getDataPrevisaoDevolucao(){
        return dataPrevisaoDevolucao;
    }

    public void setDataPrevisaoDevolucao(LocalDate dataPrevisaoDevolucao){
        this.dataPrevisaoDevolucao = dataPrevisaoDevolucao;
    }

    public Pessoa getCliente(){
        return cliente;
    }

    public void setCliente(Pessoa cliente){
        this.cliente = cliente;
    }
}
