package br.edu.unifacear.model;

public class Usuario {
	private int id;
	private int status;
	
	private String funcao;
	private String nomeUsuario;
	private String senha;
	
	private Cliente cliente;
	private GrupoUsuario grupoUsuario;
	private Vendedor vendedor;
	
	public Usuario() {
		this.id = 0;
		this.status = Globais.STATUS_ATIVO;
		
		this.funcao = "";
		this.nomeUsuario = "";
		this.senha = "";
		
		this.cliente = new Cliente();
		this.grupoUsuario = new GrupoUsuario();
		this.vendedor = new Vendedor();
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
	public String getFuncao() {
		return funcao;
	}
	public void setFuncao(String funcao) {
		this.funcao = funcao;
	}
	public String getNomeUsuario() {
		return nomeUsuario;
	}
	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public GrupoUsuario getGrupoUsuario() {
		return grupoUsuario;
	}
	public void setGrupoUsuario(GrupoUsuario grupoUsuario) {
		this.grupoUsuario = grupoUsuario;
	}
	public Vendedor getVendedor() {
		return vendedor;
	}
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
}
