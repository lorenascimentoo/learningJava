package livraria;

public class Livro {
	String nome;
	String descricao;
	double valor;
	String isbn;
	Autor autor;
	
	void mostrarDetalhes() {
		System.out.println("Mostrando detalhes do livro");
		System.out.println("Nome : "+nome);
		System.out.println("Descri��o: "+descricao);
		System.out.println("Valor: " +valor);
		System.out.println("ISBN: "+isbn);
		System.out.println();
		if (this.temAutor()) {
			autor.mostrarDetalhes();
		}
		System.out.println("---");
	}
	
	void aplicaDescontoDe(double porcentagem) {
		valor -= valor*porcentagem;
	}
	
	boolean temAutor() {
		return this.autor != null;
	}
}
