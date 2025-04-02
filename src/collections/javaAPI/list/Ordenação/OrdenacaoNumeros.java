package collections.javaAPI.list.Ordenação;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros implements Comparable<OrdenacaoNumeros> {

    private List<Integer> numeroList;

    // Métodos

    // Implementado do Comparable
    @Override
    public int compareTo(OrdenacaoNumeros n) {
        return Integer.compare(numeroList.size(), n.numeroList.size());
    }

    public OrdenacaoNumeros() {
        this.numeroList = new ArrayList<Integer>();
    }

    // Adiciona um número à lista de números. (A testar)
    public void adicionarNumero(int numero) {
        this.numeroList.add(numero);
    }

    // Exibe a Lista
    public void exibirLista() {
        if (!numeroList.isEmpty()) {
            System.out.println("Lista de numeros" + numeroList);
        }else
            System.out.println("Lista vazia");
    }

    // Ordena os números da lista em ordem ascendente usando a interface Comparable e a class Collections.
    public List<Integer> ordenarAscendente() {
        List<Integer> listaOrdenada = new ArrayList<>(numeroList);
        Collections.sort(listaOrdenada);
        System.out.println("Lista de numeros ordenada Ascendente" + listaOrdenada);

        return listaOrdenada;

    }

    //Ordena os números da lista em ordem descendente usando um Comparable e a class Collections.
    public List<Integer> ordenarDescendente() {
        List<Integer> listaOrdenada = new ArrayList<>(numeroList);
        Collections.sort(listaOrdenada.reversed());
        System.out.println("Lista de numeros ordenada Descendente" + listaOrdenada);

        return listaOrdenada;
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        // Verificando se a Lista está vazia
        ordenacaoNumeros.exibirLista();

        // Adicionando números na lista
        ordenacaoNumeros.adicionarNumero(1);
        ordenacaoNumeros.adicionarNumero(20);
        ordenacaoNumeros.adicionarNumero(9);
        ordenacaoNumeros.adicionarNumero(7);

        // Exibindo a lista desordenada
        ordenacaoNumeros.exibirLista();

        // Exibindo a lista ordenada ascendente
        ordenacaoNumeros.ordenarAscendente();

        // Exibindo a lista ordenada descendente
        ordenacaoNumeros.ordenarDescendente();


    }


}
