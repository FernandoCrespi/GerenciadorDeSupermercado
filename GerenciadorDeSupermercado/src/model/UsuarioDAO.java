package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UsuarioDAO {

    public void adicionarUsuario(Usuario usuario) {

        String sql = "INSERT INTO usuarios (nome, cpf, admin) VALUES (?, ?, ?)";

        try (Connection conexao = BancoDeDados.conectar();
             PreparedStatement pstm = conexao.prepareStatement(sql)) {

            pstm.setString(1, usuario.getNome());
            pstm.setString(2, usuario.getCpf());
            pstm.setBoolean(3, usuario.isAdm());

            pstm.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Usuario buscarPorCPF(String cpf) {

        String sql = "SELECT * FROM usuarios WHERE cpf = ?";
        Usuario usuario = null;

        try (Connection conexao = BancoDeDados.conectar();
             PreparedStatement pstm = conexao.prepareStatement(sql)) {

            pstm.setString(1, cpf);

            ResultSet rs = pstm.executeQuery();

            if (rs.next()) {
                usuario = new Usuario();
                usuario.setId(rs.getInt("id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setCpf(rs.getString("cpf"));
                usuario.setAdm(rs.getBoolean("admin"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return usuario;
    }
}
