package main;

import view.Janela;
import view.TelaCadastro;
import view.TelaLogin;

public class Main {
    public static void main(String[] args) {

        Janela janela = new Janela();
        TelaLogin login = new TelaLogin();
        TelaCadastro cadastro = new TelaCadastro();

        //ADICIONAR TELA
        janela.adicionarTela("login", login);
        janela.adicionarTela("cadastro", cadastro);
        
        janela.mostrarTela("login");

        janela.setVisible(true);
    }
}
