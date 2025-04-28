package br.com.alura.screenmatch.modelos.principal;

import br.com.alura.screenmatch.modelos.modelos.Filme;
import br.com.alura.screenmatch.modelos.modelos.Serie;
import br.com.alura.screenmatch.modelos.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Poderoso Chefão", 1972);
        meuFilme.avalia(10);
        var filmeDoMarcos = new Filme("A história da minha vida",2025);
        filmeDoMarcos.avalia(10);
        var filmeDoJoao = new Filme("Matrix",2005);
        filmeDoJoao.avalia(8);
        Serie lost = new Serie("lost",2000);
        lost.avalia(9);

        List<Titulo> lista = new ArrayList();
        lista.add(filmeDoMarcos);
        lista.add(filmeDoJoao);
        lista.add(lost);

     //   System.out.println(lista.toString());

        for(Titulo item: lista){
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2){
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

//        lista.forEach(System.out::println);

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Marcos");
        buscaPorArtista.add("Eddy Murphy");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);

        System.out.println("Depos da busca: " + buscaPorArtista);

        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getDuracaoEmMinutos));
        System.out.println("Ordenando por duração em minutos" + lista);
    }


}
