package com.example.trabalho3;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Emprestimo {

    Date dataEmprestimo = new Date();
    Date dataPrevista = new Date();
    Date data_aux = new Date();
    String nome;
    List<Item> item = new ArrayList<Item>();
    int emprestimo=0;

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public boolean emprestar(List<Livro> livros) {
        int aux;

        for(int i=0; i<livros.size();i++)
            item.add(new Item(livros.get(i)));

        //Chama o metodo para calcular a data de devolu��o caso tenha pelo menos um livro que possa ser emprestado
        CalculaDataDevolucao();
        System.out.print("\nNumero de Livros Emprestados: "+this.emprestimo);
        System.out.print("\nData de Empr�stimo: "+this.dataEmprestimo);
        System.out.print("\nData de Devolu��o: "+this.dataPrevista);
        return true;
    }

    private Date CalculaDataDevolucao() {
        Date date = new Date();

        for(int j=0;j<item.size();j++) {
            data_aux = item.get(j).calculaDataDevolucao(date);
            if( dataPrevista.compareTo(data_aux) < 0) {
                dataPrevista = data_aux;
            }
        }

        if(item.size()>2) {
            int tam = item.size()-2;
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(dataPrevista);
            calendar.add(Calendar.DATE, (tam*2));
            dataPrevista = calendar.getTime();
        }

        for(int j=0;j<item.size();j++) {
            item.get(j).setDataDevolucao(dataPrevista);
        }
        return dataPrevista;
    }

}
