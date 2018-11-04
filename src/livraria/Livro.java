package livraria;

public abstract class Livro {
	private String nome;
	private String descricao;
	private double valor;
	private String isbn;
	private Autor autor;
	
	void mostrarDetalhes() {
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
	
	public abstract boolean aplicaDescontoDe(double porcentagem);
	
	boolean temAutor() {
		return this.autor != null;
	}
	
	public Livro(Autor autor) {
		this();
		this.autor = autor;
	}
	
	public Livro() {
		this.isbn ="000-00-00000-00-0";
	}
	
	//atibuição de valores
	void setValor(double valor) {
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
	double getValor() {
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
