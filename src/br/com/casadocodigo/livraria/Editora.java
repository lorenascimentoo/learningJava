package br.com.casadocodigo.livraria;

public class Editora {
	private String nomeFantasia;
	private String razaoSocial;
	private String cnpj;
	
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public String getCnpj() {
		return cnpj;
	}
}
