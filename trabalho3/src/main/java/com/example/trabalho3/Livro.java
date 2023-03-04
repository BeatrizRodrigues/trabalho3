package com.example.trabalho3;

public class Livro {

    int prazo;
    boolean exemplarBiblioteca;
    Titulo titulo;

    public Livro(int codigo) {
        super();
        titulo = new Titulo(codigo);
        if (codigo == 2 || codigo == 4 ) {
            exemplarBiblioteca =true;
        } else {
            exemplarBiblioteca =false;
        }
    }

    public int verPrazo() {
        return titulo.getPrazo();
    }

    public boolean verificaLivro() {
        return exemplarBiblioteca;
    }

}
