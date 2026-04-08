package view;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import net.miginfocom.swing.MigLayout;

public class TelaLogin extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField tfNome;
	private JTextField tfCPF;

	/**
	 * Create the panel.
	 */
	public TelaLogin() {
		setBackground(new Color(245, 245, 220));

		setLayout(new MigLayout(
		    "align center center, wrap 2", // centraliza TUDO
		    "[right][center]",             // label direita, campo central
		    "[]20[]20[]30[]"               // espaçamento vertical
		));

		// TÍTULO
		JLabel lbTitulo = new JLabel("Mercado Massa");
		lbTitulo.setFont(new Font("Tahoma", Font.BOLD, 26));
		add(lbTitulo, "span 2, align center");

		// NOME
		JLabel lbNome = new JLabel("Nome:");
		lbNome.setFont(new Font("Tahoma", Font.PLAIN, 16));
		add(lbNome, "align right");

		tfNome = new JTextField(15); // 🔥 tamanho controlado
		add(tfNome, "growx");

		// CPF
		JLabel lbCPF = new JLabel("CPF:");
		lbCPF.setFont(new Font("Tahoma", Font.PLAIN, 16));
		add(lbCPF, "align right");

		tfCPF = new JTextField(15);
		add(tfCPF, "growx");

		// BOTÕES
		JButton btLogin = new JButton("Login");
		btLogin.setBackground(new Color(175, 238, 238));

		JButton btCadastro = new JButton("Cadastro");
		btCadastro.setBackground(new Color(175, 238, 238));

		// centraliza os botões
		add(btLogin, "span 2, split 2, center");
		add(btCadastro);




	}

}
