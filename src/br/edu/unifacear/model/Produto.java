package br.edu.unifacear.model;

public class Produto {
	private int id;
	private int estoqueAtual;
	private int status;
	
	private Double altura;
	private Double comprimento;
	private Double largura;
	private Double percentualComissao;
	private Double pesoBruto;
	private Double pesoLiquido;
	private Double quantidadeMinima;
	
	private String codigoBarras;
	private String ncm;
	private String informacoesAdicionais;
	private String referencia;
	
	
	private LinhaVeiculo linhaVeiculo;
	private ModeloVeiculo modeloVeiculo;
	private Montadora montadora;
	
	private Produto() {
		this.id = 0;
		this.estoqueAtual = 0;
		this.status = Globais.STATUS_ATIVO;
		
		this.altura = 0.00;
		this.comprimento = 0.00;
		this.largura = 0.00;
		this.percentualComissao = 0.00;
		this.pesoBruto = 0.00;
		this.pesoLiquido = 0.00;
		this.quantidadeMinima = 0.00;
		
		this.codigoBarras = "";
		this.ncm = "";
		this.informacoesAdicionais = "";
		this.referencia = "";
		
		this.linhaVeiculo = new LinhaVeiculo();
		this.modeloVeiculo = new ModeloVeiculo();
		this.montadora = new Montadora();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEstoqueAtual() {
		return estoqueAtual;
	}
	public void setEstoqueAtual(int estoqueAtual) {
		this.estoqueAtual = estoqueAtual;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	public Double getComprimento() {
		return comprimento;
	}
	public void setComprimento(Double comprimento) {
		this.comprimento = comprimento;
	}
	public Double getLargura() {
		return largura;
	}
	public void setLargura(Double largura) {
		this.largura = largura;
	}
	public Double getPercentualComissao() {
		return percentualComissao;
	}
	public void setPercentualComissao(Double percentualComissao) {
		this.percentualComissao = percentualComissao;
	}
	public Double getPesoBruto() {
		return pesoBruto;
	}
	public void setPesoBruto(Double pesoBruto) {
		this.pesoBruto = pesoBruto;
	}
	public Double getPesoLiquido() {
		return pesoLiquido;
	}
	public void setPesoLiquido(Double pesoLiquido) {
		this.pesoLiquido = pesoLiquido;
	}
	public Double getQuantidadeMinima() {
		return quantidadeMinima;
	}
	public void setQuantidadeMinima(Double quantidadeMinima) {
		this.quantidadeMinima = quantidadeMinima;
	}
	public String getCodigoBarras() {
		return codigoBarras;
	}
	public void setCodigoBarras(String codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
	public String getNcm() {
		return ncm;
	}
	public void setNcm(String ncm) {
		this.ncm = ncm;
	}
	public String getInformacoesAdicionais() {
		return informacoesAdicionais;
	}
	public void setInformacoesAdicionais(String informacoesAdicionais) {
		this.informacoesAdicionais = informacoesAdicionais;
	}
	public String getReferencia() {
		return referencia;
	}
	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}
	public LinhaVeiculo getLinhaVeiculo() {
		return linhaVeiculo;
	}
	public void setLinhaVeiculo(LinhaVeiculo linhaVeiculo) {
		this.linhaVeiculo = linhaVeiculo;
	}
	public ModeloVeiculo getModeloVeiculo() {
		return modeloVeiculo;
	}
	public void setModeloVeiculo(ModeloVeiculo modeloVeiculo) {
		this.modeloVeiculo = modeloVeiculo;
	}
	public Montadora getMontadora() {
		return montadora;
	}
	public void setMontadora(Montadora montadora) {
		this.montadora = montadora;
	}
}
