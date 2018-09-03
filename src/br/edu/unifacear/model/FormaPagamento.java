package br.edu.unifacear.model;

public class FormaPagamento {
	private int id;
	private int status;
	
	private Double taxa;
	
	private String descricao;
	
	public FormaPagamento() {
		this.id = 0;
		this.status = Globais.STATUS_ATIVO;
		
		this.taxa = 0.00;
		
		this.descricao = "";
	}
	
	public FormaPagamento(int id, int status, Double taxa, String descricao) {
		this.id = id;
		this.status = status;
		
		this.taxa = taxa;
		
		this.descricao = descricao;
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

	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
