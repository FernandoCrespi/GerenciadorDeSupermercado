package view;

import javax.swing.*;
import java.awt.CardLayout;

public class Janela extends JFrame {

    private JPanel panel;
    private CardLayout layout;

    public Janela() {
        setSize(600,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        layout = new CardLayout();
        panel = new JPanel(layout);

        setContentPane(panel);
    }

    public void adicionarTela(String nome, JPanel tela) {
        panel.add(tela, nome);
    }

    public void mostrarTela(String nome) {
        layout.show(panel, nome);
    }
}
