package br.edu.unifacear.db;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConectDb {
	private String driver;
	private String url;
	private String user;
	private String password;

	public ConectDb() {
		driver = "com.mysql.jdbc.Driver";
		url = "jdbc:mysql://192.168.25.9:3306/integrador_iv?autoReconnect=true&useSSL=false";
		user = "flexdev";
		password = "fl2xd2v_";
	}
	
	public Connection getConnection() throws IOException, ClassNotFoundException, SQLException{
		Class.forName(driver) ;
		return DriverManager.getConnection(url, user, password);
	}
}