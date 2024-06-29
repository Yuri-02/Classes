package com.poo.classes;

import java.time.LocalDate;

public class Devolucao {
    private int id;
    private LocalDate dataDevolvido;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public LocalDate getDataDevolvido(){
        return dataDevolvido;
    }

    public void setDataDevolvido(LocalDate dataDevolvido){
        this.dataDevolvido = dataDevolvido;
    }
}
