package livraria;

public class LivroFisico extends Livro implements Promocional{
	public LivroFisico(Autor autor) {
		super(autor);
	}
	
	public double getTaxaImpressao() {
		return this.getValor() * 0.05;
	}
	
	public boolean aplicaDescontoDe(double porcentagem) {
		if (porcentagem > 0.3) {
			System.out.println("N�o foi poss�vel aplicar desconto no LivroFisico: porcentagem m�xima de 30%");
			return false;
		}
		double desconto = getValor() * porcentagem;
		setValor(getValor()- desconto);
		System.out.println("Aplicando desconto no LivroFisico");
		return true;
	}
}
