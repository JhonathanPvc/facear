package br.edu.unifacear.Dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import br.edu.unifacear.model.Montadora;

public class MontadoraDao extends Dao implements DaoImplemets<Montadora> {
	private String SQL_INSERT = "INSERT INTO montadora (descricao) values(?);";
	private String SQL_UPDATE = "UPDATE montadora SET descricao=?, status=? where id=?;";
	private String SQL_DELETE = "UPDATE montadora, status=0 where id=?;";
	private String SQL_SELECT = "SELECT * FROM montadora";
	private String SQL_OBTER = "SELECT * FROM montadora WHERE id=?;";
	
	@Override
	public void inserir(Montadora m) {
		PreparedStatement ps = null;
		try {
			Conectar();
			ps = db.getConnection().prepareStatement(SQL_INSERT);
			ps.setString(1, m.getDescricao());
			
			ps.executeUpdate();
			
			Desconectar();
			
			JOptionPane.showMessageDialog(null, "Registro criado com sucesso!");
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Um erro inesperado aconteceu, contate o administrador do sistema!");
			System.err.println("===== ERRO AO INSERIR MONTADORA =====");
			System.err.println("SQL ABAIXO: ");
			System.err.println(ps.toString());
			System.err.println("======================================");
			e.printStackTrace();
		}
	}
	
	@Override
	public void excluir(Montadora m) {
		PreparedStatement ps = null;
		
		try {
			Conectar();
			
			ps = db.getConnection().prepareStatement(SQL_DELETE);
			ps.setInt(1, m.getId());
			
			ps.executeUpdate();
			Desconectar();
			
			JOptionPane.showMessageDialog(null, "Registro excluido com sucesso!");
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Um erro inesperado aconteceu, contate o administrador do sistema!");
			System.err.println("===== ERRO AO EXCLUIR MONTADORA =====");
			System.err.println("SQL ABAIXO: ");
			System.err.println(ps.toString());
			System.err.println("======================================");
			e.printStackTrace();
		}
	}
	
	@Override
	public void update(Montadora m) {
		PreparedStatement ps = null;
		
		try {
			Conectar();
			
			ps = db.getConnection().prepareStatement(SQL_UPDATE);
			ps.setString(1, m.getDescricao());
			ps.setInt(2, m.getStatus());
			ps.setInt(3, m.getId());
			
			ps.executeUpdate();
			
			Desconectar();
			
			JOptionPane.showMessageDialog(null, "Registro atualizado com sucesso");
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Um erro inesperado aconteceu, contate o administrador do sistema!");
			System.err.println("===== ERRO AO ATUALIZAR MONTADORA =====");
			System.err.println("SQL ABAIXO: ");
			System.err.println(ps.toString());
			System.err.println("======================================");
			e.printStackTrace();
		}
	}

	@Override
	public List<Montadora> listarTodos() {
		 List<Montadora> listMontadora = new ArrayList<Montadora>();
		 PreparedStatement ps = null;
		
		try {
			Conectar();
			
			ps = db.getConnection().prepareStatement(SQL_SELECT);
			ResultSet rs = ps.executeQuery();
			
			int i = 0;
			
			while(rs.next()) {
				rs.getInt("id");
				
				Montadora m = new Montadora(rs.getInt("id"), 
											rs.getInt("status"), 
											rs.getString("descricao"));
				
				listMontadora.add(m);
			}
			
			Desconectar();
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Um erro inesperado aconteceu, contate o administrador do sistema!");
			System.err.println("===== ERRO AO LISTAR MONTADORAS =====");
			System.err.println("SQL ABAIXO: ");
			System.err.println(ps.toString());
			System.err.println("======================================"); 
			e.printStackTrace();
		}
		
		return listMontadora;
	}

	@Override
	public Montadora obterPorId(int id) {
		Montadora retornoMontadora = null;
		PreparedStatement ps = null;
		
		try {
			Conectar();
			
			ps = db.getConnection().prepareStatement(SQL_OBTER);
			ps.setInt(1, id);
			
			ResultSet rs = ps.executeQuery();

			while(rs.next()) {
				
				rs.getInt("id");
				
				Montadora m = new Montadora(rs.getInt("id"), 
											rs.getInt("status"), 
											rs.getString("descricao"));
				retornoMontadora = m;
				
				break;
			}
			
			Desconectar();
			
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Um erro inesperado aconteceu, contate o administrador do sistema!");
			System.out.println("====== ERRO AO BUSCAR MONTADORA POR ID ======");
			System.err.println("SQL ABAIXO: ");
			System.err.println(ps.toString());
			System.err.println("======================================"); 
			e.printStackTrace();
		}
		
		return retornoMontadora;
	}

}
