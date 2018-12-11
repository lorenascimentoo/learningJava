package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Autor;

public abstract class Livro implements Produto{
	private String nome;
	private String descricao;
	private double valor;
	private String isbn;
	private Autor autor;
	
	public void mostrarDetalhes() {
		System.out.println("Mostrando detalhes do livro");
		System.out.println("Nome : "+nome);
		System.out.println("Descrição: "+descricao);
		System.out.println("Valor: " +valor);
		System.out.println("ISBN: "+isbn);
		System.out.println();
		if (this.temAutor()) {
			autor.mostrarDetalhes();
		}
		System.out.println("---");
	}
	
	boolean temAutor() {
		return this.autor != null;
	}
	
	public Livro(Autor autor) {
		if (autor == null) {
			throw new RuntimeException("O autor do livro não pode ser nulo!");
		}
		this.autor = autor;
		this.isbn ="000-00-00000-00-0";
	}
	public Livro() {
		
	}
	
	//atibuição de valores
	public void setValor(double valor) {
		this.valor = valor;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	//retorno de valores 
	public double getValor() {
		return this.valor;
	}
	public Autor getAutor() {
		return autor;
	}
	public String getDescricao() {
		return descricao;
	}
	public String getIsbn() {
		return isbn;
	}
	public String getNome() {
		return nome;
	}	
}
