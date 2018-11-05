package livraria;

public class Revista implements Produto, Promocional {
	private String nome;
	private String descricao;
	private double valor;
	private Editora editora;
	
	//atribuição de valores
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}	
	
	//retorno de valores
	public String getNome() {
		return nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public double getValor() {
		return valor;
	}
		
	public boolean aplicaDescontoDe(double porcentagem) {
		if(porcentagem>0.1) {
			return false;
		}
		double desconto = getValor() * porcentagem;
		setValor(getValor()-desconto);
		return true;
	}
	
}
