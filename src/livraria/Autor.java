package livraria;

public class Autor {
	private String nomeDoAutor;
	private String emailDoAutor;
	private String cpf;
	
	void mostrarDetalhes() {
		System.out.println("Mostrando detalhes do Autor");
		System.out.println("Nome : "+nomeDoAutor);
		System.out.println("Email: "+emailDoAutor);
		System.out.println("CPF: " +cpf);
	}
	
	//atribuição de valores
	public void setNomeDoAutor(String nomeDoAutor) {
		this.nomeDoAutor = nomeDoAutor;
	}
	public void setEmailDoAutor(String emailDoAutor) {
		this.emailDoAutor = emailDoAutor;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	//retorno de valores
	public String getEmailDoAutor() {
		return emailDoAutor;
	}
	public String getNomeDoAutor() {
		return nomeDoAutor;
	}
	public String getCpf() {
		return cpf;
	}
}