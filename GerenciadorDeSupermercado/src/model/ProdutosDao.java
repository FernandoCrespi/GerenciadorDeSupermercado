package model;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.BancoDeDados;
import model.Produtos;
public class ProdutosDao {
		
		public void cadastrarProduto(Produtos produto) {
	        String sql = "INSERT INTO produtos (nome, qtd, estoque) VALUES (?, ?, ?)";
	        Connection conexao = null;
	        PreparedStatement pstm = null;

	        try {
	            conexao = BancoDeDados.conectar();
	            pstm = conexao.prepareStatement(sql);
	            pstm.setString(1, produto.getNome());
	            pstm.setInt(2, produto.getQtd());
	            pstm.setInt(3, produto.getEtoque());
	            pstm.executeUpdate();
	        } catch (SQLException e) {		
	            e.printStackTrace();
	        } 
	    }
		
		 public List<Produtos> listarProdutos() {
		        String sql = "SELECT * FROM produtos";
		        List<Produtos> produto = new ArrayList<>();
		        Connection conexao = null;
		        PreparedStatement pstm = null;
		        ResultSet rset = null; // Objeto que guarda o resultado da consulta

		        try {
		            conexao = BancoDeDados.conectar();
		            pstm = conexao.prepareStatement(sql);
		            rset = pstm.executeQuery();

		            while (rset.next()) {
		               Produtos produtos = new Produtos();
		                produtos.setNome(rset.getString("nome"));
		                produtos.setQtd(rset.getInt("qtd"));
		                produtos.setEtoque(rset.getInt("estoque"));
		                produto.add(produtos);
		            }
		        } catch (SQLException e) {
		            e.printStackTrace();
		        } 
		        return produto;
		    }
		 public void atualizarUsuario(Produtos produtos) {
		        String sql = "UPDATE produtos SET qtd = ?, estoque = ? WHERE nome = ?";
		        Connection conexao = null;
		        PreparedStatement pstm = null;

		        try {
		            conexao = BancoDeDados.conectar();
		            pstm = conexao.prepareStatement(sql);
		            pstm.setString(1, produtos.getNome());
		            pstm.setInt(2, produtos.getQtd());
		            pstm.setInt(3, produtos.getEtoque());
		            pstm.executeUpdate();
		        } catch (SQLException e) {
		            e.printStackTrace();
		        } 
		    }
		 public void excluirUsuario(String nome) {
		        String sql = "DELETE FROM produtos WHERE nome = ?";
		        Connection conexao = null;
		        PreparedStatement pstm = null;

		        try {
		            conexao = BancoDeDados.conectar();
		            pstm = conexao.prepareStatement(sql);
		            pstm.setString(1, nome);
		            pstm.executeUpdate();
		        } catch (SQLException e) {
		            e.printStackTrace();
		        }
		    }
}
