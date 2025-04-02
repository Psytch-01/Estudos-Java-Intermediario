package collections.javaAPI.list.Ordenação;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    //Atributos

    @Override
    public String toString() {
        return "SomaNumeros: " +  " - Lista: " + numeroList;
    }

    private List<Integer> numeroList;

    public SomaNumeros() {
        this.numeroList = new ArrayList<Integer>();
    }

    public void adicionarNumero(int numero) {
        this.numeroList.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;
        for (int i = 0; i < numeroList.size(); i++) {
            soma += numeroList.get(i);
        }
        return soma;
    }

    public void encontrarMaiorNumero() {
        int maior = 0;
        for (int i = 0; i < numeroList.size(); i++) {
            if (numeroList.get(i) > maior) {
                maior = numeroList.get(i);
            }
            System.out.println("Maior numero: " + maior);
        }
    }

    public void encontrarMenorNumero() {
        int menor = 0;
        for (int i = 0; i < numeroList.size(); i--) {
            menor = numeroList.get(i);
            if (menor < numeroList.get(i)) {
                menor = numeroList.get(i);
            }
        }
        System.out.println("Menor numero: " + menor);
    }

    public void exibirNumeros() {
        System.out.println("Números presentes na lista: " + numeroList);
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.exibirNumeros();
        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(55);
        somaNumeros.adicionarNumero(40);
        somaNumeros.adicionarNumero(400);

        somaNumeros.encontrarMaiorNumero();
        //somaNumeros.encontrarMenorNumero();



    }



}
