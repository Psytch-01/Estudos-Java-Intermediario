package collections.javaAPI.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }
    public void adicionarProduto(long cod, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(cod, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtoPorNome = new TreeSet<>(produtoSet);
        System.out.println("Produtos: " + produtoPorNome);

        return produtoPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtoPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtoPorPreco.addAll(produtoSet);
        System.out.println("Produtos: " + produtoPorPreco);

        return produtoPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(255645564, "Batata Frita", 22.50, 2);
        cadastroProdutos.adicionarProduto(225361548, "Doce de Leite", 2.00, 4);
        cadastroProdutos.adicionarProduto(558987654, "Coca-cola", 10.00, 1);

        System.out.println("--------------------------");
        System.out.println("Imprimindo produtos por ordem crescente de preço");

        cadastroProdutos.exibirProdutosPorPreco();

        System.out.println("--------------------------");
        System.out.println("Imprimindo produtos por ordem alfabética de nome");
        cadastroProdutos.exibirProdutosPorNome();
    }
}
