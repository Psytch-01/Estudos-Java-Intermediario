package collections.javaAPI.list.operacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> carrinhoCompras;


    public CarrinhoDeCompras() {
        carrinhoCompras = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        carrinhoCompras.add(new Item(nome, preco, quantidade));
    }

    //Remove um item do carrinho com base no seu nome.
    public void removerItem(String nome) {
        List<Item> itemsParaRemover = new ArrayList<>();
        for (Item i : carrinhoCompras) {
            if(i.getNome().equalsIgnoreCase(nome)) {
                itemsParaRemover.add(i);
            }
        }
        carrinhoCompras.removeAll(itemsParaRemover);
    }

    // Calcula e retorna o valor total do carrinho, levando em consideração o preço e a quantidade de cada item.
    public void calcularValorTotal(){
        double total = 0;
        for (Item i : carrinhoCompras) {
            total += i.getPreco()*i.getQuantidade();
        }
        System.out.println("Total: " + total);

    }

    // Exibe todos os itens presentes no carrinho, mostrando seus nomes, preços e quantidades.
       public void exibirItens() {
        if(carrinhoCompras.isEmpty()){
            System.out.println("O seu carrinho está vazio");
        }else {
            System.out.println("Carrinho de compras");
            for (Item i : carrinhoCompras) {
                System.out.println(i.getNome() + " - " + i.getPreco() + " - " + "Qtd.: " + i.getQuantidade());
            }
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Coquinha Zero", 10.0, 4);
        carrinho.adicionarItem("Bolacha Maizena", 3.00, 3);

        carrinho.exibirItens();
        carrinho.calcularValorTotal();

        System.out.println("|-------------------------------|");

        carrinho.removerItem("Coquinha Zero");
        carrinho.exibirItens();
        carrinho.calcularValorTotal();
    }
}
