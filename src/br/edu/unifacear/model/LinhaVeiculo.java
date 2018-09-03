package br.edu.unifacear.model;

public class LinhaVeiculo {
	private int id;
	private int status;
	
	private String descricao;

	public LinhaVeiculo() {
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
