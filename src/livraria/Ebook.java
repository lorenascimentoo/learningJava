package livraria;

public class Ebook extends Livro{
	
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
			return false;
		}
		return super.aplicaDescontoDe(porcentagem);
	}
}
