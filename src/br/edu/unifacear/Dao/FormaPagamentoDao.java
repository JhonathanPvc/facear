package br.edu.unifacear.Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.edu.unifacear.model.FormaPagamento;

public class FormaPagamentoDao extends Dao implements DaoImplemets<FormaPagamento> {
	private String SQL_INSERT = "INSERT INTO forma_pagamento (descricao, taxa, status) VALUES(?,?,?);";
	private String SQL_DELETE = "UPDATE forma_pagamento set status = 0 where id = ?;";
	private String SQL_UPDATE = "UPDATE forma_pagamento SET descricao = ?, taxa = ?, status = ? where id = ?;";
	private String SQL_SELECT = "SELECT * FROM forma_pagamento";
	private String SQL_OBTER = "SELECT * FROM forma_pagamento WHERE id=?;";
		
	@Override
	public void inserir(FormaPagamento f) {
		PreparedStatement ps = null;
		
		try {
			Conectar();
			
			ps = db.getConnection().prepareStatement(SQL_INSERT);
			ps.setString(1, f.getDescricao());
			ps.setDouble(2, f.getTaxa());
			ps.setInt(3, f.getStatus());
			ps.executeUpdate();
			
			Desconectar();
			
			JOptionPane.showMessageDialog(null, "Registro criado com sucesso!");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Um erro inesperado aconteceu, contate o administrador do sistema!");
			System.err.println("===== ERRO AO INSERIR FORMA DE PAGAMENTO =====");
			System.err.println("SQL ABAIXO: ");
			System.err.println(ps.toString());
			System.err.println("======================================");
			e.printStackTrace();
		}
	}

	@Override
	public void excluir(FormaPagamento f) {
		PreparedStatement ps = null;
		try {
			Conectar();
			
			ps = db.getConnection().prepareStatement(SQL_DELETE);
			
			ps.setInt(1, f.getId());
			
			ps.executeUpdate();
			
			Desconectar();
			
			JOptionPane.showMessageDialog(null, "Registro excluido com sucesso!");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Um erro inesperado aconteceu, contate o administrador do sistema!");
			System.err.println("===== ERRO AO EXCLUIR FORMA PAGAMENTO =====");
			System.err.println("SQL ABAIXO: ");
			System.err.println(ps.toString());
			System.err.println("======================================");
			e.printStackTrace();
		}
	}

	@Override
	public void update(FormaPagamento f) {
		PreparedStatement ps = null;
		try {
			Conectar();
			
			ps = db.getConnection().prepareStatement(SQL_UPDATE);
			ps.setString(1, f.getDescricao());
			ps.setDouble(2, f.getTaxa());
			ps.setInt(3, f.getStatus());
			ps.setInt(4, f.getId());
			ps.executeUpdate();
			
			Desconectar();
			
			JOptionPane.showMessageDialog(null, "Registro atualizado com sucesso");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Um erro inesperado aconteceu, contate o administrador do sistema!");
			System.err.println("===== ERRO AO ATUALIZAR FORMA PAGAMENTO =====");
			System.err.println("SQL ABAIXO: ");
			System.err.println(ps.toString());
			System.err.println("======================================");
			e.printStackTrace();
		}
	}

	@Override
	public List<FormaPagamento> listarTodos() {
		List<FormaPagamento> listFormaPagamento = new ArrayList<FormaPagamento>();
		PreparedStatement ps = null;
		
		try {
			Conectar();

			ps = db.getConnection().prepareStatement(SQL_SELECT);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				rs.getInt("id");
				
				FormaPagamento fm = new FormaPagamento(rs.getInt("id"), 
													   rs.getInt("status"), 
													   rs.getDouble("taxa"), 
													   rs.getString("descricao"));
				listFormaPagamento.add(fm);
			}
			
			Desconectar();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Um erro inesperado aconteceu, contate o administrador do sistema!");
			System.err.println("===== ERRO AO LISTAR FORMAS DE PAGAMENTO =====");
			System.err.println("SQL ABAIXO: ");
			System.err.println(ps.toString());
			System.err.println("======================================"); 
			e.printStackTrace();
		}
		
		return listFormaPagamento;
	}

	@Override
	public FormaPagamento obterPorId(int id) {
		FormaPagamento retornoFormaPagamento = null;
		PreparedStatement ps = null;
		
		try {
			Conectar();
			
			ps = db.getConnection().prepareStatement(SQL_OBTER);
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				
				rs.getInt("id");
				
				FormaPagamento fm = new FormaPagamento(rs.getInt("id"), 
													   rs.getInt("status"), 
													   rs.getDouble("taxa"), 
													   rs.getString("descricao"));
				retornoFormaPagamento = fm;
				
				break;
			}
			
			Desconectar();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Um erro inesperado aconteceu, contate o administrador do sistema!");
			System.out.println("====== ERRO AO BUSCAR FORMA PAGAMENTO POR ID ======");
			System.err.println("SQL ABAIXO: ");
			System.err.println(ps.toString());
			System.err.println("======================================"); 
			e.printStackTrace();
		}
		return retornoFormaPagamento;
	}

}
