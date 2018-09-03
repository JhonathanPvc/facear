package br.edu.unifacear.model;

import java.util.Date;

public class Venda {
	private int id;
	private int flagOrgamento;
	private int situacao;
	
	private Date dataCraicao;
	private Date dataEdicao;
	
	private Double valorTotalDesconto;
	private Double valorTotalProdutos;
	private Double valorTotalVenda;
	
	private Cliente cliente;
	private Usuario usuarioCriacao;
	private Usuario usuarioEdicao;
	
	public Venda() {
		this.id = 0;
		this.flagOrgamento = Globais.STATUS_INATIVO;
		this.situacao = Globais.STATUS_ATIVO;
		
		this.dataCraicao = new Date();
		this.dataEdicao = new Date();
		
		this.valorTotalDesconto = 0.00;
		this.valorTotalProdutos = 0.00;
		this.valorTotalVenda = 0.00;
		
		this.cliente = new Cliente();
		this.usuarioCriacao = new Usuario();
		this.usuarioEdicao = new Usuario();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getFlagOrgamento() {
		return flagOrgamento;
	}
	public void setFlagOrgamento(int flagOrgamento) {
		this.flagOrgamento = flagOrgamento;
	}
	public int getSituacao() {
		return situacao;
	}
	public void setSituacao(int situacao) {
		this.situacao = situacao;
	}
	public Date getDataCraicao() {
		return dataCraicao;
	}
	public void setDataCraicao(Date dataCraicao) {
		this.dataCraicao = dataCraicao;
	}
	public Date getDataEdicao() {
		return dataEdicao;
	}
	public void setDataEdicao(Date dataEdicao) {
		this.dataEdicao = dataEdicao;
	}
	public Double getValorTotalDesconto() {
		return valorTotalDesconto;
	}
	public void setValorTotalDesconto(Double valorTotalDesconto) {
		this.valorTotalDesconto = valorTotalDesconto;
	}
	public Double getValorTotalProdutos() {
		return valorTotalProdutos;
	}
	public void setValorTotalProdutos(Double valorTotalProdutos) {
		this.valorTotalProdutos = valorTotalProdutos;
	}
	public Double getValorTotalVenda() {
		return valorTotalVenda;
	}
	public void setValorTotalVenda(Double valorTotalVenda) {
		this.valorTotalVenda = valorTotalVenda;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Usuario getUsuarioCriacao() {
		return usuarioCriacao;
	}
	public void setUsuarioCriacao(Usuario usuarioCriacao) {
		this.usuarioCriacao = usuarioCriacao;
	}
	public Usuario getUsuarioEdicao() {
		return usuarioEdicao;
	}
	public void setUsuarioEdicao(Usuario usuarioEdicao) {
		this.usuarioEdicao = usuarioEdicao;
	}
}
