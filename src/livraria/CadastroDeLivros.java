package livraria;

public class CadastroDeLivros {
	public static void main(String[] args) {
		Autor autor = new Autor();
		autor.setNomeDoAutor("Rodrigo Turini");
		autor.setEmailDoAutor("rodrigo.turini@kh.com");
		autor.setCpf("123.456.789.10");
	
		
		Livro livro = new LivroFisico(autor);
		livro.setNome("Java 8 Prático");
		livro.setDescricao("Novos recursos da linguagem");
		livro.setValor(59.90);
		livro.mostrarDetalhes();
		if (!livro.aplicaDescontoDe(0.2)) {
			System.out.println("Desconto não pode ser maior que 30%");
		} else {
			System.out.println("Valor com desconto: " + livro.getValor());
		}
		//livro.setIsbn("978-85-66250-46-6");
		System.out.println("-----");
		
		Autor outroAutor = new Autor();
		outroAutor.setNomeDoAutor("Paulo Silveira");
		outroAutor.setEmailDoAutor("paulo.silveira@kh.com");
		outroAutor.setCpf("123.456.789.10");
				
		Livro outroLivro = new Ebook(outroAutor);
		outroLivro.setNome("Lógica de Programação");
		outroLivro.setDescricao("Crie seus primeiros programas");
		outroLivro.setValor(59.90);
		outroLivro.setIsbn("978-85-66250-22-0");
		outroLivro.mostrarDetalhes();
		System.out.println("-----");
		
		
		Ebook ebook = new Ebook(outroAutor);
		ebook.setNome("Teste Ebook");
		ebook.setValor(59.90);
		ebook.mostrarDetalhes();
		if (!ebook.aplicaDescontoDe(0.1)) {
			System.out.println("Desconto não pode ser maior que 15%");
		} else {
			System.out.println("Valor com desconto: " + ebook.getValor());
		}
	}
}
