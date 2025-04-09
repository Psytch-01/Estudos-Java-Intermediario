package collections.javaAPI.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long codigo, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(codigo, new Produto(nome, quantidade, preco));
    }

    public void exibirProdutos() {
        System.out.println("Produtos Em Estoque: " + estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                valorTotalEstoque += p.getQuantidade() * p.getPreco();
            }
        }
        System.out.println("Valor total do estoque: " + valorTotalEstoque);
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro () {
        Produto produtoMaisCaro =  null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato () {
        Produto produtoMaisBarato =  null;
        double menorPreco = Double.MAX_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() < menorPreco) {
                    produtoMaisBarato = p;
                    menorPreco = p.getPreco();
                }
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaiorQuantidadeValorEstoque =  null;
        double maiorValorTotalProdutoEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Map.Entry<Long, Produto> entry : estoqueProdutosMap.entrySet()) {
                double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
                if (valorProdutoEmEstoque > maiorValorTotalProdutoEstoque) {
                    maiorValorTotalProdutoEstoque = valorProdutoEmEstoque;
                    produtoMaiorQuantidadeValorEstoque = entry.getValue();
                }
            }
        }
        return produtoMaiorQuantidadeValorEstoque;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        estoqueProdutos.adicionarProduto(100, "batata Frita", 5, 5.00);
        estoqueProdutos.adicionarProduto(102, "cebola KG", 2, 3.00);
        estoqueProdutos.adicionarProduto(106, "Coca Cola", 15, 11.50);
        estoqueProdutos.adicionarProduto(104, "Fanta", 10, 12.0);

        estoqueProdutos.exibirProdutos();
        System.out.println("--------------");

        estoqueProdutos.calcularValorTotalEstoque();
        System.out.println("--------------");

        System.out.println("Produto mais barato: " + estoqueProdutos.obterProdutoMaisBarato());
        System.out.println("--------------");

        System.out.println("Produto mais caro: " + estoqueProdutos.obterProdutoMaisCaro());

        System.out.println("--------------");

        System.out.println("Produto com maior quantidade em valor no estoque: " + estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());

        System.out.println("--------------");



    }
}
