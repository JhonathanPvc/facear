package br.edu.unifacear.Dao;

import java.sql.PreparedStatement;
import java.util.List;

import br.edu.unifacear.model.Usuario;

public class UsuarioDao extends Dao implements DaoImplemets<Usuario> {
	private String SQL_INSERT = "INSERT INTO usuario (cliente_id,vendedor_id,grupo_usuario_id,nome_usuario, senha) VALUES (?,?,?,?,?);";
	private String SQL_DELETE = "UPDATE forma_pagamento set status = 0 where id = ?;";
	private String SQL_UPDATE = "UPDATE forma_pagamento SET descricao = ?, taxa = ?, status = ? where id = ?;";
	private String SQL_SELECT = "SELECT * FROM forma_pagamento";
	private String SQL_OBTER = "SELECT * FROM forma_pagamento WHERE id=?;";
	
	@Override
	public void inserir(Usuario u) {
		PreparedStatement ps = null;
		try {
			Conectar();
			ps = db.getConnection().prepareStatement(SQL_INSERT);
			ps.setInt(1, u.getCliente().getId());
			ps.setInt(2, u.getVendedor().getId());
			ps.setInt(3, u.getGrupoUsuario().getId());
			ps.setString(4, u.getNomeUsuario());
			ps.setString(5, u.getSenha());
			
			
			Desconectar();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Override
	public void excluir(Usuario u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Usuario u) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Usuario> listarTodos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Usuario obterPorId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
