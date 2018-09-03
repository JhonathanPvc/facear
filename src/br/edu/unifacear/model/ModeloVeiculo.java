package br.edu.unifacear.model;

public class ModeloVeiculo {
	private int id;
	private int status;
	
	private String descricao;
	
	private Montadora montadora;

	public ModeloVeiculo() {
		this.id = 0;
		this.status = Globais.STATUS_ATIVO;
		
		this.descricao = "";
		
		this.montadora = new Montadora();
		
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

	public Montadora getMontadora() {
		return montadora;
	}

	public void setMontadora(Montadora montadora) {
		this.montadora = montadora;
	}
}
