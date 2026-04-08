package model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.BancoDeDados;
import model.Usuario;
public class UsuarioDAO {

	
	public void adicionarUsuario(Usuario usuario) {
        String sql = "INSERT INTO usuarios (nome, email) VALUES (?, ?)";
        Connection conexao = null;
        PreparedStatement pstm = null;

        try {
            conexao = BancoDeDados.conectar();
            pstm = conexao.prepareStatement(sql);
            pstm.setString(1, usuario.getNome());
            pstm.setString(2, usuario.getCpf());
            pstm.executeUpdate();
        } catch (SQLException e) {		
            e.printStackTrace();
        } 
    }
	public void atualizarUsuario(Usuario usuario) {
        String sql = "UPDATE usuarios SET nome = ?, email = ? WHERE id = ?";
        Connection conexao = null;
        PreparedStatement pstm = null;

        try {
            conexao = BancoDeDados.conectar();
            pstm = conexao.prepareStatement(sql);
            pstm.setString(1, usuario.getNome());
            pstm.setString(2, usuario.getCpf());
            pstm.setInt(3, usuario.getId());
            pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } 
    }
	public void excluirUsuario(int id) {
        String sql = "DELETE FROM usuarios WHERE id = ?";
        Connection conexao = null;
        PreparedStatement pstm = null;

        try {
            conexao = BancoDeDados.conectar();
            pstm = conexao.prepareStatement(sql);
            pstm.setInt(1, id);
            pstm.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } 
    }
	
}
