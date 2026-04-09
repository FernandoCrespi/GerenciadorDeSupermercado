package model;

import java.util.*;

public class Carrinho {

    private List<ItemCarrinho> itens = new ArrayList<>();

    public void adicionar(String nome, double preco) {

        for (ItemCarrinho i : itens) {
            if (i.getNome().equals(nome)) {
                i.setQuantidade(i.getQuantidade() + 1);
                return;
            }
        }

        itens.add(new ItemCarrinho(nome, preco, 1));
    }

    public void remover(int index) {
        itens.remove(index);
    }

    public List<ItemCarrinho> getItens() {
        return itens;
    }

    public double getTotal() {

        double total = 0;

        for (ItemCarrinho i : itens) {
            total += i.getPreco() * i.getQuantidade();
        }

        return total;
    }

    public void limpar() {
        itens.clear();
    }
}
