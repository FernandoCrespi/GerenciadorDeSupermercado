package main;

import controller.*;
import model.*;
import view.*;

public class Main {

    public static void main(String[] args) {

        Janela janela = new Janela();

        TelaLogin login = new TelaLogin();
        TelaCadastro cadastro = new TelaCadastro();
        TelaProdutos produtos = new TelaProdutos();
        TelaCompra compra = new TelaCompra();

        janela.adicionarTela("login", login);
        janela.adicionarTela("cadastro", cadastro);
        janela.adicionarTela("produtos", produtos);
        janela.adicionarTela("compra", compra);

        UsuarioDAO usuarioDAO = new UsuarioDAO();
        ProdutosDao produtosDAO = new ProdutosDao();

        new LoginController(janela, login, usuarioDAO, compra, produtosDAO);
        new CadastroController(janela, cadastro, usuarioDAO);
        new ProdutosController(janela, produtos, produtosDAO);

        janela.mostrarTela("login");
        janela.setVisible(true);
    }
}
