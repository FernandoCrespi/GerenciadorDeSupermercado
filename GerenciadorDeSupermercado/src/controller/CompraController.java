package controller;

import model.*;
import view.*;

import javax.swing.*;

public class CompraController {

    private Carrinho carrinho = new Carrinho();
    private Usuario usuario;
    private boolean compraFinalizada = false;

    public CompraController(Janela j, TelaCompra t, ProdutosDao dao, Usuario usuarioLogado) {

        this.usuario = usuarioLogado;

        carregarProdutos(t, dao);

        t.getBtNota().setEnabled(false);

        t.getBtAdicionar().addActionListener(e -> {

            int linha = t.getTabelaProdutos().getSelectedRow();

            if (linha != -1) {

                String nome = t.getModelProdutos().getValueAt(linha, 0).toString();
                double preco = Double.parseDouble(t.getModelProdutos().getValueAt(linha, 1).toString());

                carrinho.adicionar(nome, preco);

                atualizarCarrinho(t);
            }
        });

        t.getBtRemover().addActionListener(e -> {

            int linha = t.getTabelaCarrinho().getSelectedRow();

            if (linha != -1) {
                carrinho.remover(linha);
                atualizarCarrinho(t);
            }
        });

        t.getBtFinalizar().addActionListener(e -> {

            for (ItemCarrinho item : carrinho.getItens()) {

                for (Produtos banco : dao.listarProdutos()) {

                    if (banco.getNome().equals(item.getNome())) {

                        int novoEstoque = banco.getEstoque() - item.getQuantidade();

                        if (novoEstoque < 0) {
                            JOptionPane.showMessageDialog(null, "Estoque insuficiente para: " + banco.getNome());
                            return;
                        }

                        dao.atualizarEstoque(banco.getNome(), novoEstoque);
                    }
                }
            }

            compraFinalizada = true;

            JOptionPane.showMessageDialog(null, "Compra finalizada!");

            t.getBtNota().setEnabled(true);

            carregarProdutos(t, dao);
        });

        t.getBtNota().addActionListener(e -> {

            if (!compraFinalizada) {
                JOptionPane.showMessageDialog(null, "Finalize a compra primeiro!");
                return;
            }

            String nota = "===== NOTA FISCAL =====\n";
            nota += "Nome: " + usuario.getNome() + "\n";
            nota += "CPF: " + usuario.getCpf() + "\n\n";

            nota += "Itens:\n";

            for (ItemCarrinho i : carrinho.getItens()) {
                nota += "- " + i.getNome() + " | Qtd: " + i.getQuantidade() + " | R$ " + i.getPreco() + "\n";
            }

            nota += "\nTotal: R$ " + carrinho.getTotal();

            JOptionPane.showMessageDialog(null, nota);

            carrinho.limpar();
            t.getModelCarrinho().setRowCount(0);
            t.setTotal(0);

            compraFinalizada = false;
            t.getBtNota().setEnabled(false);
        });

        t.getBtVoltar().addActionListener(e -> j.mostrarTela("login"));
    }

    private void carregarProdutos(TelaCompra t, ProdutosDao dao) {

        t.getModelProdutos().setRowCount(0);

        for (Produtos p : dao.listarProdutos()) {
            t.getModelProdutos().addRow(new Object[]{
                p.getNome(), p.getPreco(), p.getEstoque()
            });
        }
    }

    private void atualizarCarrinho(TelaCompra t) {

        t.getModelCarrinho().setRowCount(0);

        for (ItemCarrinho i : carrinho.getItens()) {
            t.getModelCarrinho().addRow(new Object[]{
                i.getNome(), i.getQuantidade(), i.getPreco()
            });
        }

        t.setTotal(carrinho.getTotal());
    }
}
