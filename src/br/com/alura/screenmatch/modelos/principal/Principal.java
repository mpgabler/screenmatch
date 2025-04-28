package br.com.alura.screenmatch.modelos.principal;

import br.com.alura.screenmatch.modelos.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.modelos.Episodio;
import br.com.alura.screenmatch.modelos.modelos.Filme;
import br.com.alura.screenmatch.modelos.calculos.FiltroRecomendacao;

import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Poderoso Chefão", 1972);

        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(6);
        meuFilme.avalia(8);
        meuFilme.avalia(7);

        System.out.println("Soma da avaliacoes: " + meuFilme.getSomaDasAvalicoes());
        System.out.println("Total de avaliacoes: " + meuFilme.getTotalDeAvaliacoes());

        System.out.println("Media das avaliacoes: " + meuFilme.pegaMedia());

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var filmeDoMarcos = new Filme("A história da minha vida",2025);
        filmeDoMarcos.setDuracaoEmMinutos(200);
        filmeDoMarcos.avalia(10);

        var filmeDoJoao = new Filme("Matrix",2005);
        filmeDoJoao.setDuracaoEmMinutos(200);
        filmeDoJoao.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList();
        listaDeFilmes.add(filmeDoMarcos);
        listaDeFilmes.add(filmeDoJoao);
        System.out.println("Filmes adicionados até o momento: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());

        System.out.println("toString do filme: " + listaDeFilmes.toString());
    }
}