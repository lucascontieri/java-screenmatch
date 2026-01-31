package br.com.lucascontieri.screenmatch.model;

import br.com.lucascontieri.screenmatch.calculator.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) calculaMedia() / 2;
    }
}
