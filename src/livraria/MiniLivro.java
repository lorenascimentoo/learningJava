package livraria;

public class MiniLivro extends Livro{
	public MiniLivro(Autor autor) {
		super(autor);
	}

	@Override
	public boolean aplicaDescontoDe(double porcentagem) {
		System.out.println("N�o foi poss�vel aplicar desconto: n�o permitido para este tipo de livro");
		return false;
	}
	
}
