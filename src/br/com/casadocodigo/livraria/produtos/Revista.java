package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Editora;

public class Revista implements Produto, Promocional {
	private String nome;
	private String descricao;
	private double valor;
	private Editora editora;
	
	//atribuição de valores
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}	
	public void setEditora(Editora editora) {
		this.editora = editora;
	}
	
	//retorno de valores
	public String getNome() {
		return nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public double getValor() {
		return valor;
	}
	public Editora getEditora() {
		return editora;
	}
		
	public boolean aplicaDescontoDe(double porcentagem) {
		if(porcentagem>0.1) {
			return false;
		}
		double desconto = getValor() * porcentagem;
		setValor(getValor()-desconto);
		return true;
	}
	
	@Override
	public int compareTo(Produto outro) {
		if(this.getValor() < outro.getValor()) {
			return -1;
		}
		if(this.getValor() > outro.getValor()) {
			return 1;
		}
		return 0;
	}
	
}
