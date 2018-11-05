package br.com.casadocodigo.livraria.teste;

import br.com.casadocodigo.livraria.Autor;
import br.com.casadocodigo.livraria.produtos.Livro;
import br.com.casadocodigo.livraria.produtos.MiniLivro;

public class RegrasDeDesconto {
	public static void main(String[] args) {
		Autor autor = new Autor();
		autor.setNomeDoAutor("Rodrigo Turini");
		Livro livro= new MiniLivro(autor);
		livro.setValor(39.90);
		
		System.out.println("Valor atual: "+livro.getValor());
		
	}
}
