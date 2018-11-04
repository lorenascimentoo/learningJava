package livraria;

public class MiniLivro extends Livro{
	public MiniLivro(Autor autor) {
		super(autor);
	}

	@Override
	public boolean aplicaDescontoDe(double porcentagem) {
		System.out.println("Não foi possível aplicar desconto: não permitido para este tipo de livro");
		return false;
	}
	
}
