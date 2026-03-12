package view;

import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class TelaLogin extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField tfNome;
	private JTextField tfCPF;

	/**
	 * Create the panel.
	 */
	public TelaLogin() {
		setLayout(null);
		
		JLabel lbTitulo = new JLabel("Mercado Massa");
		lbTitulo.setFont(new Font("Tahoma", Font.BOLD, 24));
		lbTitulo.setBounds(120, 11, 182, 34);
		add(lbTitulo);
		
		JLabel lbNome = new JLabel("Nome:");
		lbNome.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbNome.setBounds(24, 85, 57, 14);
		add(lbNome);
		
		tfNome = new JTextField();
		tfNome.setBounds(91, 82, 248, 20);
		add(tfNome);
		tfNome.setColumns(10);
		
		JLabel lbCPF = new JLabel("CPF:");
		lbCPF.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lbCPF.setBounds(24, 126, 57, 14);
		add(lbCPF);
		
		tfCPF = new JTextField();
		tfCPF.setBounds(91, 125, 248, 20);
		add(tfCPF);
		tfCPF.setColumns(10);
		
		JButton btLogin = new JButton("Login");
		btLogin.setBounds(91, 200, 89, 23);
		add(btLogin);
		
		JButton btCadastro = new JButton("Cadastro");
		btCadastro.setBounds(250, 200, 89, 23);
		add(btCadastro);


	}

}
