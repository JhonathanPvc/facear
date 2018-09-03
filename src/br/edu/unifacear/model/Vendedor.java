package br.edu.unifacear.model;

public class Vendedor {
	private int id;
	private int status;
	
	private String email;
	private String nome;
	private String observacao;
	private String telefone;
	
	public Vendedor() {
		this.id = 0;
		this.status = Globais.STATUS_ATIVO;
		
		this.email = "";
		this.nome = "";
		this.observacao = "";
		this.telefone = "";
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
}
