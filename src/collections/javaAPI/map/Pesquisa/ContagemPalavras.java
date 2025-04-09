package collections.javaAPI.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {

    private Map<String, Integer> palavraMap;

    public ContagemPalavras() {
        this.palavraMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        palavraMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        if (!palavraMap.isEmpty()) {
            palavraMap.remove(palavra);
        } else {
            System.out.println("O Map esta vazio");
        }
    }

    public int exibirContagemPalavras() {
        int contagem = 0;
        for (int contagemPalavra : palavraMap.values()) {
            contagem += contagemPalavra;
        }
        return contagem;
    }

    public String encontrarPalavrasMaisFrequente() {
        String linguagemMaisFrequente = null;
        int maiorContagem = 0;
        for (Map.Entry<String, Integer> entry : palavraMap.entrySet()) {
            if (entry.getValue() > maiorContagem) {
                maiorContagem = entry.getValue();
                linguagemMaisFrequente = entry.getKey();
            }
        }
        return linguagemMaisFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras palavras = new ContagemPalavras();

        // Adiciona palavras e suas contagens
        palavras.adicionarPalavra("Java", 2);
        palavras.adicionarPalavra("Python", 8);
        palavras.adicionarPalavra("JavaScript", 1);
        palavras.adicionarPalavra("C#", 6);

        // Exibindo a contagem total de palavras
        System.out.println("Total de Palavras: " + palavras.exibirContagemPalavras());

        // Encontrando e exibindo a palavra mais frequente
        System.out.println("A palavra mais frequente foi: " + palavras.encontrarPalavrasMaisFrequente());


    }
}
