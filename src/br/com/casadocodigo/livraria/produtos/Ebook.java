package br.com.casadocodigo.livraria.produtos;

import br.com.casadocodigo.livraria.Autor;

public class Ebook extends Livro implements Promocional{
	
	private String waterMark;
	
	
	public void setWaterMark(String waterMark) {
		this.waterMark = waterMark;
	}
	
	public String getWaterMark() {
		return waterMark;
	}
	
	//dependência de contrutor
	public Ebook(Autor autor) {
		super(autor);
	}
	
	@Override
	public boolean aplicaDescontoDe(double porcentagem) {
		
		if (porcentagem > 0.15) {
			System.out.println("Não foi possível aplicar desconto no Ebook: porcentagem máxima de 15%");
			return false;
		}
		double desconto = getValor() * porcentagem;
		setValor(getValor()- desconto);
		System.out.println("Aplicando desconto no Ebook");
		return true;
	}
	@Override
	public String toString() {
		return "Ebook";
	}
}
