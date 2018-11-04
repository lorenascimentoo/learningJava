package livraria;

public class RegrasDeDesconto {
	public static void main(String[] args) {
		Autor autor = new Autor();
		autor.setNomeDoAutor("Rodrigo Turini");
		Livro livro= new MiniLivro(autor);
		livro.setValor(39.90);
		
		System.out.println("Valor atual: "+livro.getValor());
		
		if (!livro.aplicaDescontoDe(0.40)) {
			System.out.println(" --- ");
		} else {
			System.out.println("Valor com desconto: "+livro.getValor());
		}
		
	}
}
