package collections.javaAPI.map.OperacoesBasicas;

import java.util.LinkedHashMap;
import java.util.Map;

public class Dicionario {

    private final Map<String, String> palavrasMap;

    public Dicionario() {
        this.palavrasMap = new LinkedHashMap<>();
    }

    // Adiciona uma palavra e sua definição ao dicionário, associando a palavra à sua definição correspondente.
    public void adicionarPalavra(String palavra, String definicao) {
        palavrasMap.put(palavra, definicao);
    }

    // Remove uma palavra do dicionário, dado o termo a ser removido.
    public void removerPalavra(String palavra) {
        if (!palavrasMap.isEmpty()) {
            palavrasMap.remove(palavra);
        }
    }

    public void exibirPalavras() {
        for (Map.Entry<String, String> palavra : palavrasMap.entrySet()) {
            System.out.println(palavra.getKey() + " - " + palavra.getValue());

        }
    }

    public void pesquisarPorPalavra(String palavra) {
        for (Map.Entry<String, String> palavras : palavrasMap.entrySet()) {
            if (palavras.getKey().equals(palavra)) {
                System.out.println(palavras.getValue());
            }
        }
    }

    public static void main(String[] args) {
        Dicionario d = new Dicionario();

        System.out.println("Adicionando palavras e mostrando definições");
        d.adicionarPalavra("Batata", "Tubérculo que nasce abaixo da terra");
        d.adicionarPalavra("Beterraba", "Leguminosa de origem duvidosa, pode manchar roupas");
        d.exibirPalavras();

        System.out.println("--------------------");

        System.out.println("Removendo palavra e mostrando lista atualizada");
        d.removerPalavra("Beterraba");
        d.exibirPalavras();

        System.out.println("--------------------");

        System.out.println("Pesquisando definição por palavra (batata)");
        d.pesquisarPorPalavra("Batata");
    }
}
