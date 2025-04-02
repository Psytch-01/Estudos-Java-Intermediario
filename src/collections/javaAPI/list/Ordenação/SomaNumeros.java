package collections.javaAPI.list.Ordenação;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    //Atributos

    private List<Integer> numeroList;

    public SomaNumeros() {
        this.numeroList = new ArrayList<Integer>();
    }

    // Adiciona um número à lista de números. (Funcionando)
    public void adicionarNumero(int numero) {
        this.numeroList.add(numero);
    }


    // Retorna uma lista contendo todos os números presentes na lista. (Funcionando)
    public void exibirNumeros() {
        System.out.println("Números presentes na lista: " + numeroList);
    }

    // Calcula a soma de todos os números na lista e retorna o resultado. (Funcionando)
    public int calcularSoma() {
        int soma = 0;
        for (int i = 0; i < numeroList.size(); i++) {
            soma += numeroList.get(i);
        }
        System.out.println("Soma: " + soma);
        return soma;

    }

    //  Encontra o maior número na lista e retorna o valor. (Funcionando)
    public int encontrarMaiorNumero() {
        int maiorNumero = Integer.MIN_VALUE;
        for (int i = 0; i < numeroList.size(); i++) {
            if (numeroList.get(i) > maiorNumero) {
                maiorNumero = numeroList.get(i);
            }
        }
        System.out.println("Maior numero: " + maiorNumero);
        return maiorNumero;
    }

    //  Encontra o menor número na lista e retorna o valor. (Funcionando)
    public int encontrarMenorNumero() {
        int menorNumero = Integer.MAX_VALUE;
        for (int i = 0; i < numeroList.size(); i++) {
            if (numeroList.get(i) < menorNumero) {
                menorNumero = numeroList.get(i);
            }
        }
        System.out.println("Maior numero: " + menorNumero);
        return menorNumero;
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        // Verificando se a lista está vazia
        somaNumeros.exibirNumeros();

        // Adicionando Númeos à lista
        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(9);
        somaNumeros.adicionarNumero(10);

        // Exibindo os números adicionados
        somaNumeros.exibirNumeros();

        // Realizando a soma dos númeoros da lista
        somaNumeros.calcularSoma();

        // Verificando o maior número
        somaNumeros.encontrarMaiorNumero();

        // Verificando o menor número
        somaNumeros.encontrarMenorNumero();
    }
}
