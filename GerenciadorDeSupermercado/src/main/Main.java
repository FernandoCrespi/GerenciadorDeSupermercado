package main;

import view.Janela;
import view.TelaLogin;

public class Main {
    public static void main(String[] args) {

        Janela janela = new Janela();
        TelaLogin login = new TelaLogin();

        janela.adicionarTela("login", login);
        janela.mostrarTela("login");

        janela.setVisible(true);
    }
}
