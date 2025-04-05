package collections.javaAPI.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {

    private Set<String> palavrasUnicasSet;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicasSet = new HashSet<>();
    }


    // Adiciona uma palavra ao conjunto.
    public void adicionarPalavra(String palavra) {
        this.palavrasUnicasSet.add(palavra);
    }

    // Remove uma palavra do conjunto.
    public void removePalavra(String palavra) {
        this.palavrasUnicasSet.remove(palavra);
    }

    public void verificaPalavra(String palavra) {
        if (this.palavrasUnicasSet.contains(palavra)) {
            System.out.println("A palavra " + palavra + " existe no banco de dados.");

        }else {
            System.out.println("A palavra " + palavra + " não existe no banco de dados.");

        }
    }


    public void exibirPalavrasUnicas() {
        System.out.println(this.palavrasUnicasSet);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjunto = new ConjuntoPalavrasUnicas();

        // Exibe a lista atual (Vazia)
        conjunto.exibirPalavrasUnicas();

        //Adicionando Palavra No Conjunto
        conjunto.adicionarPalavra("Batatinha");
        conjunto.adicionarPalavra("Polenta Frita");
        conjunto.adicionarPalavra("Onion Rings");

        // Exibe a lista Atualizada
        conjunto.exibirPalavrasUnicas();

        // Verifica a existencia de uma palavra no conjunto
        conjunto.verificaPalavra("Frango Frito");

        // Removendo palavra do conjunto
        conjunto.removePalavra("Polenta Frita");
        conjunto.exibirPalavrasUnicas();
    }
}
