package br.edu.unifacear.model;

public class Montadora {
	private int id;
	private int status;
	
	private String descricao;

	public Montadora(int id, int status, String descricao) {
		this.id = id;
		this.status = status;
		this.descricao = descricao;
	}
	
	public Montadora() {
		this.id = 0;
		this.status = Globais.STATUS_ATIVO;
		
		this.descricao = "";
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
