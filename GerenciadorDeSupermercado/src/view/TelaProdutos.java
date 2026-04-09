package view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import net.miginfocom.swing.MigLayout;

public class TelaProdutos extends JPanel {

    private JTextField tfNome;
    private JTextField tfPreco;
    private JTextField tfEstoque;

    private JTable tabela;
    private DefaultTableModel model;

    private JButton btAdicionar, btAtualizar, btExcluir, btVoltar;

    public TelaProdutos() {

        setBackground(new Color(245,245,220));

        setLayout(new MigLayout("fill, wrap 2", "[right][grow]"));

        JLabel titulo = new JLabel("Gerenciar Produtos");
        titulo.setFont(new Font("Tahoma", Font.BOLD, 24));
        add(titulo, "span 2, center");

        add(new JLabel("Nome:"));
        tfNome = new JTextField(15);
        add(tfNome, "growx");

        add(new JLabel("Preço:"));
        tfPreco = new JTextField(15);
        add(tfPreco, "growx");

        add(new JLabel("Estoque:"));
        tfEstoque = new JTextField(15);
        add(tfEstoque, "growx");

        btAdicionar = new JButton("Adicionar");
        btAtualizar = new JButton("Atualizar");
        btExcluir = new JButton("Excluir");
        btVoltar = new JButton("Voltar");

        add(btAdicionar, "span 2, split 4, center");
        add(btAtualizar);
        add(btExcluir);
        add(btVoltar);

        model = new DefaultTableModel(new Object[]{"Nome", "Preço", "Estoque"}, 0);
        tabela = new JTable(model);

        add(new JScrollPane(tabela), "span 2, grow");

        tabela.getSelectionModel().addListSelectionListener(e -> {

            int linha = tabela.getSelectedRow();

            if (linha != -1) {

                tfNome.setText(model.getValueAt(linha, 0).toString());
                tfPreco.setText(model.getValueAt(linha, 1).toString());
                tfEstoque.setText(model.getValueAt(linha, 2).toString());
            }
        });
    }

    public String getNome() {
        return tfNome.getText();
    }

    public double getPreco() {
        try {
            return Double.parseDouble(tfPreco.getText());
        } catch (Exception e) {
            return 0;
        }
    }

    public int getEstoque() {
        try {
            return Integer.parseInt(tfEstoque.getText());
        } catch (Exception e) {
            return 0;
        }
    }

    public JTable getTabela() {
        return tabela;
    }

    public DefaultTableModel getModel() {
        return model;
    }

    public JButton getBtAdicionar() {
        return btAdicionar;
    }

    public JButton getBtAtualizar() {
        return btAtualizar;
    }

    public JButton getBtExcluir() {
        return btExcluir;
    }

    public JButton getBtVoltar() {
        return btVoltar;
    }
}
