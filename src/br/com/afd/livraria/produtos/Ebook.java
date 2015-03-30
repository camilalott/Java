package br.com.afd.livraria.produtos;

import br.com.afd.livraria.Autor;

public class Ebook extends Livro implements Promocional {

	private String waterMark;

	public Ebook(Autor autor) {
		super(autor);
	}
	
	
	@Override 
	// Assinatura do Contrato Pormocional, deve reescrever esse método.
	public boolean aplicaDescontoDe(double porcentagem) {
		if (porcentagem > 0.15) {
			return false;
		}
		System.out.println("aplicando desconto no Ebook"); 
		double desconto = getValor() * porcentagem;
		setValor(getValor() - desconto);
		return true;
	}
	
	public String getWaterMark() {
		return waterMark;
	}

	public void setWaterMark(String waterMark) {
		this.waterMark = waterMark;
	}

}
