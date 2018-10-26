package livraria;

public class CadastroDeLivros {
	public static void main(String[] args) {
		Autor autor = new Autor();
		autor.nomeDoAutor = "Rodrigo Turini";
		autor.emailDoAutor ="rodrigo.turini@kh.com";
		autor.cpf= "123.456.789.10";
		
		Livro livro = new Livro();
		livro.nome = "Java 8 Pr�tico";
		livro.descricao = "Novos recursos da linguagem";
		livro.valor = 59.90;
		livro.aplicaDescontoDe(0.2);
		livro.isbn = "978-85-66250-46-6";
		livro.autor= autor;
		livro.mostrarDetalhes();
		
		Autor outroAutor = new Autor();
		outroAutor.nomeDoAutor="Paulo Silveira";
		outroAutor.emailDoAutor="paulo.silveira@kh.com";
		outroAutor.cpf="123.456.789.10";
		
		Livro outroLivro = new Livro();
		outroLivro.nome = "L�gica de Programa��o";
		outroLivro.descricao = "Crie seus primeiros programas";
		outroLivro.valor = 59.90;
		outroLivro.isbn="978-85-66250-22-0";
		//outroLivro.autor = outroAutor;
		outroLivro.mostrarDetalhes();
	}
}
