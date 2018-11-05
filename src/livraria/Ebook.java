package livraria;

public class Ebook extends Livro implements Promocional{
	
	private String waterMark;
	
	
	public void setWaterMark(String waterMark) {
		this.waterMark = waterMark;
	}
	
	public String getWaterMark() {
		return waterMark;
	}
	
	//depend�ncia de contrutor
	public Ebook(Autor autor) {
		super(autor);
	}
	
	@Override
	public boolean aplicaDescontoDe(double porcentagem) {
		
		if (porcentagem > 0.15) {
			System.out.println("N�o foi poss�vel aplicar desconto no Ebook: porcentagem m�xima de 15%");
			return false;
		}
		double desconto = getValor() * porcentagem;
		setValor(getValor()- desconto);
		System.out.println("Aplicando desconto no Ebook");
		return true;
	}
}
