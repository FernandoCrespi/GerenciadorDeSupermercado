package view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import net.miginfocom.swing.MigLayout;

public class TelaCompra extends JPanel {

    private JTable tabelaProdutos;
    private JTable tabelaCarrinho;

    private DefaultTableModel modelProdutos;
    private DefaultTableModel modelCarrinho;

    private JButton btAdicionar, btRemover, btFinalizar, btNota, btVoltar;

    private JLabel lbTotal;

    public TelaCompra() {

        setBackground(new Color(245,245,220));
        setLayout(new MigLayout("fill, wrap 2", "[grow][grow]"));

        JLabel lbEstoque = new JLabel("ESTOQUE");
        lbEstoque.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(lbEstoque, "center");

        JLabel lbCarrinho = new JLabel("CARRINHO");
        lbCarrinho.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(lbCarrinho, "center");

        modelProdutos = new DefaultTableModel(new Object[]{"Nome","Preço","Estoque"},0);
        tabelaProdutos = new JTable(modelProdutos);
        add(new JScrollPane(tabelaProdutos), "grow");

        modelCarrinho = new DefaultTableModel(new Object[]{"Nome","Quantidade","Preço"},0);
        tabelaCarrinho = new JTable(modelCarrinho);
        add(new JScrollPane(tabelaCarrinho), "grow");

        lbTotal = new JLabel("Total: R$ 0");
        lbTotal.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(lbTotal, "span 2, center");

        btAdicionar = new JButton("Adicionar >>");
        btRemover = new JButton("Remover");
        btFinalizar = new JButton("Finalizar");
        btNota = new JButton("Nota Fiscal");
        btVoltar = new JButton("Voltar");

        add(btAdicionar, "span 2, split 5, center");
        add(btRemover);
        add(btFinalizar);
        add(btNota);
        add(btVoltar);
    }

    public JTable getTabelaProdutos(){return tabelaProdutos;}
    public JTable getTabelaCarrinho(){return tabelaCarrinho;}

    public DefaultTableModel getModelProdutos(){return modelProdutos;}
    public DefaultTableModel getModelCarrinho(){return modelCarrinho;}

    public JButton getBtAdicionar(){return btAdicionar;}
    public JButton getBtRemover(){return btRemover;}
    public JButton getBtFinalizar(){return btFinalizar;}
    public JButton getBtNota(){return btNota;}
    public JButton getBtVoltar(){return btVoltar;}

    public void setTotal(double total){
        lbTotal.setText("Total: R$ " + total);
    }
}
