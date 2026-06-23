package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculo.CalculadoraTempo;
import br.com.alura.screenmatch.calculo.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        //filme
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(10);
        meuFilme.avalia(6);

        System.out.println(meuFilme.getSomaDasAvaliacoes());
        System.out.println(meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        //serie
        Serie minhaSerie = new Serie("lost", 2000);
        minhaSerie.exibeFichaTecnica();
        minhaSerie.setTemporadas(10);
        minhaSerie.setEpisodiosPorTemporada(10);
        minhaSerie.setMinutosPorEpisodios(50);
        System.out.println("Duranção para maratonar a serie: " + minhaSerie.getDuracaoEmMinutos());

        System.out.println("===============================================");

        //calculadora
        CalculadoraTempo calculadora = new CalculadoraTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(minhaSerie);
        System.out.println(calculadora.getTempoTotal());

        //filtro
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        //Episodio
        Episodio episodio = new Episodio();
        episodio.setNumeroEp(1);
        episodio.setSerie(minhaSerie);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        //filme 2
        var filmeDoPaulo= new Filme("DogVille", 2003);
        filmeDoPaulo.setDuracaoEmMinutos(200);
        filmeDoPaulo.avalia(10);

        System.out.println("===============================================");

        //Lista de filmes
        ArrayList<Filme> listaFilmes = new ArrayList<>();
        listaFilmes.add(filmeDoPaulo);
        listaFilmes.add(meuFilme);
        System.out.println("O tamanho da lista é: " + listaFilmes.size());
        System.out.println("O primero filme da lista é: " + listaFilmes.get(0).getNome());

        System.out.println("Tamanho da lista: " + listaFilmes.size());
        System.out.println("Primeiro Filme:"  + listaFilmes.get(0));
        System.out.println(listaFilmes);
    }
}