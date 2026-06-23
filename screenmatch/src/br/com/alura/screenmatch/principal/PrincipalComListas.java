package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);
        Serie minhaSerie = new Serie("lost", 2000);
        minhaSerie.avalia(6);
        var filmeDoPaulo= new Filme("DogVille", 2003);
        filmeDoPaulo.avalia(10);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoPaulo);
        lista.add(meuFilme);
        lista.add(minhaSerie);

        for (Titulo item : lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classififação: " + filme.getClassificacao());
            }
        }

        //Procurar artista
        List<String> buscaArtista = new LinkedList<>();
        buscaArtista.add("Adam Sandler");
        buscaArtista.add("Paulo");
        buscaArtista.add("Jacqueline");
        System.out.println(buscaArtista);

        Collections.sort(lista);
        System.out.println(lista);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(lista);

    }

}
