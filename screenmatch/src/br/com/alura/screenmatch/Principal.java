package br.com.alura.screenmatch;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.io.File;
import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        Filme meuFilme = new Filme("PrimeiroFilme", 2023);
//        meuFilme.setNome("PrimeiroFilme");
//        meuFilme.setAnoLancamento(2023);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setIncluidoNoPlano(true);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(9);
        meuFilme.avalia(8);
        meuFilme.avalia(3);

        System.out.println("Duracao em minutos filme: " + meuFilme.getDuracaoEmMinutos());
        System.out.println("Total avaliacoes: " + meuFilme.getTotalAvaliacoes());
        System.out.println("media: " + meuFilme.pegaMedia());

        System.out.println("\n****** serie *******");

        Serie serie = new Serie("got", 2000);
//        serie.setNome("GOT");
//        serie.setAnoLancamento(2013);
        serie.setAtiva(false);
        serie.setTemporadas(6);
        serie.setMinutosPorEpisodio(40);
        serie.setEpisodiosPorTemporada(8);
        serie.exibeFichaTecnica();

        System.out.println("duracao em minutos serie: " + serie.getDuracaoEmMinutos());

        Filme outroFilme = new Filme("outroFilme", 2009);
//        outroFilme.setNome("Outro nome do Filme");
//        outroFilme.setAnoLancamento(2023);
        outroFilme.setDuracaoEmMinutos(100);
        outroFilme.setIncluidoNoPlano(true);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(serie);
        System.out.println(calculadora.getTempoTotal());

        System.out.println("**** Filtro de recomendacao ****");

        FiltroRecomendacao filtro = new FiltroRecomendacao();

        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var maisUmFilme = new Filme("ävatar", 3002);
        maisUmFilme.setDuracaoEmMinutos(200);
//        maisUmFilme.setNome("Ävatar");
//        maisUmFilme.setAnoLancamento(2010);
        maisUmFilme.avalia(10);

//        ***** Lista de filmes
        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(maisUmFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("\nTamanho da lista: "+ listaDeFilmes.size());
        System.out.println("Primeiro item: " + listaDeFilmes.getFirst().getNome());
        System.out.println(listaDeFilmes);
    }
}
