package br.edu.unifacear.model;

public class CondicaoVenda {
	private int id;
	private int diasPrimeiraParcela;
	private int intervaloDias;
	private int parcelas;
	private int status;
	
	private String Descricao;
	
	public CondicaoVenda() {
		this.id = 0;
		this.diasPrimeiraParcela = 0;
		this.intervaloDias = 0;
		this.parcelas = 0;
		this.status = Globais.STATUS_ATIVO;
		
		this.Descricao = "";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getDiasPrimeiraParcela() {
		return diasPrimeiraParcela;
	}

	public void setDiasPrimeiraParcela(int diasPrimeiraParcela) {
		this.diasPrimeiraParcela = diasPrimeiraParcela;
	}

	public int getIntervaloDias() {
		return intervaloDias;
	}

	public void setIntervaloDias(int intervaloDias) {
		this.intervaloDias = intervaloDias;
	}

	public int getParcelas() {
		return parcelas;
	}

	public void setParcelas(int parcelas) {
		this.parcelas = parcelas;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
	
	
}
