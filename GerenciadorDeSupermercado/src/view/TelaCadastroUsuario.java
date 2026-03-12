package view;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBox;

public class TelaCadastroUsuario extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField tfNome;
	private JTextField tfCPF;

	/**
	 * Create the panel.
	 */
	public TelaCadastroUsuario() {
		setLayout(null);
		
		JLabel lbTitulo = new JLabel("Cadastro");
		lbTitulo.setFont(new Font("Tahoma", Font.BOLD, 24));
		lbTitulo.setBounds(162, 11, 116, 22);
		add(lbTitulo);
		
		JLabel lbNome = new JLabel("Nome:");
		lbNome.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbNome.setBounds(50, 73, 46, 14);
		add(lbNome);
		
		tfNome = new JTextField();
		tfNome.setBounds(106, 72, 215, 20);
		add(tfNome);
		tfNome.setColumns(10);
		
		JLabel lbCPF = new JLabel("CPF:");
		lbCPF.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbCPF.setBounds(50, 124, 46, 14);
		add(lbCPF);
		
		tfCPF = new JTextField();
		tfCPF.setBounds(106, 118, 215, 20);
		add(tfCPF);
		tfCPF.setColumns(10);
		
		JLabel lbEhAdm = new JLabel("Administrador:");
		lbEhAdm.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lbEhAdm.setBounds(50, 182, 89, 14);
		add(lbEhAdm);
		
		JCheckBox ckSim = new JCheckBox("Sim sou");
		ckSim.setBounds(145, 180, 61, 23);
		add(ckSim);
		
		JCheckBox ckNao = new JCheckBox("Sou usuario");
		ckNao.setBounds(224, 180, 97, 23);
		add(ckNao);

		
		
		
	}
}
