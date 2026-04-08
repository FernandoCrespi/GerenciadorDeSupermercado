package view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import java.awt.Font;
import java.awt.Color;
import net.miginfocom.swing.MigLayout;

public class TelaCadastro extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField tfNome;
	private JTextField tfCPF;
	private JCheckBox cbAdmin;
	private JButton btSalvar;
	private JButton btVoltar;

	public TelaCadastro() {

		setBackground(new Color(245, 245, 220));

		setLayout(new MigLayout(
			"align center center, wrap 2",
			"[right][grow,fill]",
			"[]20[]20[]20[]30[]"
		));

		JLabel lbTitulo = new JLabel("Cadastro de Usuário");
		lbTitulo.setFont(new Font("Tahoma", Font.BOLD, 26));
		add(lbTitulo, "span 2, align center");

		JLabel lbNome = new JLabel("Nome:");
		lbNome.setFont(new Font("Tahoma", Font.PLAIN, 16));
		add(lbNome);

		tfNome = new JTextField(15);
		add(tfNome);

		JLabel lbCPF = new JLabel("CPF:");
		lbCPF.setFont(new Font("Tahoma", Font.PLAIN, 16));
		add(lbCPF);

		tfCPF = new JTextField(15);
		add(tfCPF);

		JLabel lbAdmin = new JLabel("Administrador:");
		lbAdmin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		add(lbAdmin);

		cbAdmin = new JCheckBox();
		cbAdmin.setBackground(new Color(245, 245, 220));
		add(cbAdmin, "left");

		btSalvar = new JButton("Salvar");
		btSalvar.setBackground(new Color(144, 238, 144));

		btVoltar = new JButton("Voltar");
		btVoltar.setBackground(new Color(240, 128, 128));

		add(btSalvar, "span 2, split 2, center");
		add(btVoltar);
	}

	// 🔥 GETTERS (MVC)
	public String getNome() {
		return tfNome.getText();
	}

	public String getCPF() {
		return tfCPF.getText();
	}

	public boolean isAdmin() {
		return cbAdmin.isSelected();
	}

	public JButton getBtSalvar() {
		return btSalvar;
	}

	public JButton getBtVoltar() {
		return btVoltar;
	}
}
