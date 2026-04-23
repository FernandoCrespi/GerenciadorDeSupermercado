package controller;

import model.*;
import view.*;

public class LoginController {

    public LoginController(Janela janela, TelaLogin t, UsuarioDAO dao,
                           TelaCompra telaCompra, ProdutosDao produtosDAO) {

        t.getBtCadastro().addActionListener(e -> janela.mostrarTela("cadastro"));

        t.getBtLogin().addActionListener(e -> {

            Usuario u = dao.buscarPorCPF(t.getCPF());

            if (u != null) {

                if (u.isAdm()) {
                    janela.mostrarTela("produtos");
                } else {
                    new CompraController(janela, telaCompra, produtosDAO, u);
                    janela.mostrarTela("compra");
                }
            }
        });
    }
}
