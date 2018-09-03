package br.edu.unifacear.model;

import java.sql.Date;

public class Cliente {
	private int id;
	private int stautus;
	private int tipoCliente;
	
	private String cnpj;
	private String cpf;
	private String nome;
	private String nomeFantasia;
	private String razaoSocial;
	
	private Date dataNascimento;
	
	public Cliente() {
		this.id = 0;
		this.stautus = Globais.STATUS_ATIVO;
		this.tipoCliente = 0;
		
		this.cnpj = "";
		this.cpf = "";
		this.nome = "";
		this.nomeFantasia = "";
		this.razaoSocial = "";
		
		this.dataNascimento = null;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStautus() {
		return stautus;
	}

	public void setStautus(int stautus) {
		this.stautus = stautus;
	}

	public int getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(int tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
}
