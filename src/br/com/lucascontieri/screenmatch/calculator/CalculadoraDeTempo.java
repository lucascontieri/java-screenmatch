package br.com.lucascontieri.screenmatch.calculator;

import br.com.lucascontieri.screenmatch.model.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal = 0;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

//    public void inclui(Filme f){
//        this.tempoTotal += f.getDuracaoEmMinutos();
//    }
//
//    // Sobrecaga de Metodo
//    public void inclui(Serie s){
//        this.tempoTotal+= s.getDuracaoEmMinutos();
//    }

    // Melhorando o design da classe

    public void inclui(Titulo titulo) {
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
