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

        setLayout(new MigLayout(
            "align center center, wrap 2", 
            "[right][grow,fill]", 
            "[]20[]20[]30[]"
        ));

        JLabel titulo = new JLabel("Cadastro de Usuário");
        titulo.setFont(new Font("Tahoma", Font.BOLD, 24));
        add(titulo, "span 2, align center");

        add(new JLabel("Nome:"), "align right");
        nome = new JTextField(15);
        add(nome, "growx");

        add(new JLabel("CPF:"), "align right");
        cpf = new JTextField(15);
        add(cpf, "growx");

        add(new JLabel("Admin:"), "align right");
        admin = new JCheckBox();
        admin.setBackground(new Color(245,245,220));
        add(admin, "left");

        salvar = new JButton("Salvar");
        voltar = new JButton("Voltar");

        add(salvar, "span 2, split 2, center");
        add(voltar);
    }

    public String getNome(){ return nome.getText(); }
    public String getCPF(){ return cpf.getText(); }
    public boolean isAdmin(){ return admin.isSelected(); }
    public JButton getBtSalvar(){ return salvar; }
    public JButton getBtVoltar(){ return voltar; }
}
