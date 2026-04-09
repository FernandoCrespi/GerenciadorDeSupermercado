package controller;

import model.*;
import view.*;

public class ProdutosController {

    public ProdutosController(Janela j, TelaProdutos t, ProdutosDao dao) {

        atualizar(t, dao);

        t.getBtAdicionar().addActionListener(e -> {
            dao.cadastrarProduto(new Produtos(t.getNome(), t.getPreco(), t.getEstoque()));
            atualizar(t, dao);
        });

        t.getBtAtualizar().addActionListener(e -> {
            dao.atualizarProduto(new Produtos(t.getNome(), t.getPreco(), t.getEstoque()));
            atualizar(t, dao);
        });

        t.getBtExcluir().addActionListener(e -> {
            dao.excluirProduto(t.getNome());
            atualizar(t, dao);
        });

        t.getBtVoltar().addActionListener(e -> j.mostrarTela("login"));
    }

    private void atualizar(TelaProdutos t, ProdutosDao dao) {

        t.getModel().setRowCount(0);

        for (Produtos p : dao.listarProdutos()) {
            t.getModel().addRow(new Object[]{
                p.getNome(), p.getPreco(), p.getEstoque()
            });
        }
    }
}
