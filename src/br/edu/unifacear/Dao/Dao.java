package br.edu.unifacear.Dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import br.edu.unifacear.db.ConectDb;

@SuppressWarnings("unused")
public class Dao {
	protected ConectDb db;
	protected Connection connection;
	
	public Dao() {
		db = new ConectDb();
	}
	
	public void Conectar() throws Exception {
		if(connection == null)
				connection = db.getConnection();
	}
	
	public void Desconectar() throws Exception{
		if(connection != null)
			connection.close();
	}	
}

