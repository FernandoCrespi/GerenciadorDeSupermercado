package view;

import javax.swing.*;
import java.awt.*;
import net.miginfocom.swing.MigLayout;

public class TelaCadastro extends JPanel {

    private JTextField nome, cpf;
    private JCheckBox admin;
    private JButton salvar, voltar;

    public TelaCadastro() {
        setBackground(new Color(245,245,220));
        setLayout(new MigLayout("wrap 2, align center"));

        add(new JLabel("Nome:"));
        nome = new JTextField(15);
        add(nome);

        add(new JLabel("CPF:"));
        cpf = new JTextField(15);
        add(cpf);

        add(new JLabel("Admin:"));
        admin = new JCheckBox();
        admin.setBackground(new Color(245,245,220));
        add(admin);

        salvar = new JButton("Salvar");
        voltar = new JButton("Voltar");

        add(salvar, "span 2, split 2");
        add(voltar);
    }

    public String getNome(){return nome.getText();}
    public String getCPF(){return cpf.getText();}
    public boolean isAdmin(){return admin.isSelected();}
    public JButton getBtSalvar(){return salvar;}
    public JButton getBtVoltar(){return voltar;}
}
