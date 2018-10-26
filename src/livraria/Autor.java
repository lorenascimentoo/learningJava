package livraria;

public class Autor {
	String nomeDoAutor;
	String emailDoAutor;
	String cpf;
	
	void mostrarDetalhes() {
		System.out.println("Mostrando detalhes do Autor");
		System.out.println("Nome : "+nomeDoAutor);
		System.out.println("Email: "+emailDoAutor);
		System.out.println("CPF: " +cpf);
	}
}