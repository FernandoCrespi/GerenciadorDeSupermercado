package model;

import java.sql.*;
import java.util.*;

public class ProdutosDao {

    public void cadastrarProduto(Produtos p) {

        String sql = "INSERT INTO produtos (nome, preco, estoque) VALUES (?, ?, ?)";

        try (Connection c = BancoDeDados.conectar();
             PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setString(1, p.getNome());
            ps.setDouble(2, p.getPreco());
            ps.setInt(3, p.getEstoque());

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Produtos> listarProdutos() {

        List<Produtos> lista = new ArrayList<>();
        String sql = "SELECT * FROM produtos";

        try (Connection c = BancoDeDados.conectar();
             PreparedStatement ps = c.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {

                Produtos p = new Produtos(
                    rs.getString("nome"),
                    rs.getDouble("preco"),
                    rs.getInt("estoque")
                );

                lista.add(p);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }

    public void atualizarProduto(Produtos p) {

        String sql = "UPDATE produtos SET preco = ?, estoque = ? WHERE nome = ?";

        try (Connection c = BancoDeDados.conectar();
             PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setDouble(1, p.getPreco());
            ps.setInt(2, p.getEstoque());
            ps.setString(3, p.getNome());

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void excluirProduto(String nome) {

        String sql = "DELETE FROM produtos WHERE nome = ?";

        try (Connection c = BancoDeDados.conectar();
             PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setString(1, nome);
            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void atualizarEstoque(String nome, int novo) {

        String sql = "UPDATE produtos SET estoque = ? WHERE nome = ?";

        try (Connection c = BancoDeDados.conectar();
             PreparedStatement ps = c.prepareStatement(sql)) {

            ps.setInt(1, novo);
            ps.setString(2, nome);

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
