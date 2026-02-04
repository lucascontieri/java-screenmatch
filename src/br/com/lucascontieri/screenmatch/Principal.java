package br.com.lucascontieri.screenmatch;

import br.com.lucascontieri.screenmatch.calculator.CalculadoraDeTempo;
import br.com.lucascontieri.screenmatch.calculator.FiltroRecomendacao;
import br.com.lucascontieri.screenmatch.model.Episodio;
import br.com.lucascontieri.screenmatch.model.Filme;
import br.com.lucascontieri.screenmatch.model.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        //Instanciando a classe Filme
        Filme meuFilme = new Filme();
        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("O total de avaliações do filme, [" + meuFilme.getNome() + "], foi de " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.calculaMedia());
        //meuFilme.somaDasAvaliacoes = 10;
        //meuFilme.totalDeAvaliacoes = 1;
        //System.out.println(meuFilme.calculaMedia());

        Serie theLastOfUs = new Serie();
        theLastOfUs.setNome("The Last of Us");
        theLastOfUs.setAnoDeLancamento(2023);
        theLastOfUs.exibeFichaTecnica();
        theLastOfUs.setTemporadas(4);
        theLastOfUs.setEpisodiosPorTemporada(1);
        theLastOfUs.setMinutosPorEpisodio(60);
        System.out.println("Tempo de maratona da série: " + theLastOfUs.getDuracaoEmMinutos());

        // Instanciando outro objeto da classe Filme
        Filme meuFilme02 = new Filme();
        meuFilme02.setNome("Homem Aranha");
        meuFilme02.setAnoDeLancamento(2010);
        meuFilme02.setDuracaoEmMinutos(200);


        // Declarando a calculadora
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(meuFilme02);
        calculadora.inclui(theLastOfUs);
        System.out.println("A duração total em minutos é: " + calculadora.getTempoTotal());

        // Utilizando o filtro de recomendacao
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(theLastOfUs);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var meuFilme03 = new Filme();
        meuFilme03.setNome("Até o Último Homem");
        meuFilme03.setAnoDeLancamento(2016);
        meuFilme03.setDuracaoEmMinutos(139);
        meuFilme03.avalia(9.5);

        // Criando uma lista de filmes
        ArrayList<Filme> listaDeFilmes = new ArrayList<>();

        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(meuFilme02);
        listaDeFilmes.add(meuFilme03);

        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println("Lista de filmes: " + listaDeFilmes);
    }
}