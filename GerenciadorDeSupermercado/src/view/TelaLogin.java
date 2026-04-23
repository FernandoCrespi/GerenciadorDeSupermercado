package view;

import javax.swing.*;
import java.awt.*;
import net.miginfocom.swing.MigLayout;

public class TelaLogin extends JPanel {

    private JTextField nome, cpf;
    private JButton login, cadastro;

    public TelaLogin() {

        setBackground(new Color(245,245,220));

        setLayout(new MigLayout(
            "align center center, wrap 2",
            "[right][grow,fill]",
            "[]20[]30[]"
        ));

        JLabel titulo = new JLabel("Mercado Massa");
        titulo.setFont(new Font("Tahoma", Font.BOLD, 26));
        add(titulo, "span 2, align center");

        add(new JLabel("Nome:"), "align right");
        nome = new JTextField(15);
        add(nome, "growx");

        add(new JLabel("CPF:"), "align right");
        cpf = new JTextField(15);
        add(cpf, "growx");

        login = new JButton("Login");
        cadastro = new JButton("Cadastro");

        add(login, "span 2, split 2, center");
        add(cadastro);
    }

    public String getNome(){ return nome.getText(); }
    public String getCPF(){ return cpf.getText(); }
    public JButton getBtLogin(){ return login; }
    public JButton getBtCadastro(){ return cadastro; }
}
