package com.example.trabalho3;

import java.util.ArrayList;
import java.util.List;

public class Controle {

    public boolean emprestar(String aluno, int[] prazos, int num) {

        Aluno a = new Aluno(aluno);

        if (!a.verficaAluno()) {
            System.out.println("Aluno Inexistente");
            return false;
        }


        if (!a.verificaDebito()) {
            System.out.println("Aluno em Debito");
            return false;
        }

        List<Livro> livros = new ArrayList<Livro>();

        for(int i=0; i< num;i++) {
            Livro l = new Livro(prazos[i]+1);
            if (!l.verificaLivro())
                livros.add(l);
        }

        if (livros.size() > 0 ) {
            return a.emprestar(livros);
        } else {
            return false;
        }

    }

}
