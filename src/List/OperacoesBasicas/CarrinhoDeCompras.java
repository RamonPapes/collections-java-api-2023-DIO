package List.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinho = new ArrayList<>();

    public CarrinhoDeCompras() {
        this.carrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        this.carrinho.add(new Item(nome,preco,quantidade));
    }

    public void removerItem(String nome){
        List<Item> remover = new ArrayList<>();
        for(Item i : carrinho){
            if(i.getNome().equalsIgnoreCase(nome)){
                remover.add(i);
            }
        }
        carrinho.removeAll(remover);
    }

    public double calcularValorTotal(){
        double total = 0;
        for(Item i : carrinho){
            total += i.getPreco() * i.getQuantidade();
        }
        return total;
    }

    public void exibirItens(){
        System.out.println(carrinho);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("Pizza",20,5);
        carrinho.adicionarItem("Queijo",15,4);

        System.out.println("O valor total e: " + carrinho.calcularValorTotal());
        carrinho.exibirItens();

    }
}
