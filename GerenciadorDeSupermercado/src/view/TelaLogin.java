package view;

import javax.swing.*;
import java.awt.*;
import net.miginfocom.swing.MigLayout;

public class TelaLogin extends JPanel {

    private JTextField nome, cpf;
    private JButton login, cadastro;

    public TelaLogin() {
        setBackground(new Color(245,245,220));
        setLayout(new MigLayout("wrap 2, align center"));

        add(new JLabel("Nome:"));
        nome = new JTextField(15);
        add(nome);

        add(new JLabel("CPF:"));
        cpf = new JTextField(15);
        add(cpf);

        login = new JButton("Login");
        cadastro = new JButton("Cadastro");

        add(login, "span 2, split 2");
        add(cadastro);
    }

    public String getNome(){return nome.getText();}
    public String getCPF(){return cpf.getText();}
    public JButton getBtLogin(){return login;}
    public JButton getBtCadastro(){return cadastro;}
}
