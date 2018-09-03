package br.edu.unifacear.model;

public class GrupoUsuario {
	private int id;
	private int nivel;
	private int status;
	
	private String descricao;

	public GrupoUsuario() {
		this.id = 0;
		this.nivel = Globais.FUNCIONARIO_NIVEL_VENDEDOR;
		this.status = Globais.STATUS_ATIVO;
		
		this.descricao = "";
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
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
