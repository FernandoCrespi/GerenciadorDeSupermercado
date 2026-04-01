package view;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;

public class Janela extends JFrame {
	
	private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    
    
    private TelaLogin telaLogin;
    
    public Janela(){

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,400);

        CardLayout cardLayout = new CardLayout();
        contentPane = new JPanel(cardLayout);

        setContentPane(contentPane);

    }

    public void adicionarTela(String nome,JPanel tela){

        contentPane.add(tela,nome);

    }

    public void mostrarTela(String nome){

        cardLayout.show(contentPane,nome);

    }

}
