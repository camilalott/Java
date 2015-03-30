package br.com.afd.livraria.produtos;

@FunctionalInterface
public interface Promocional {

	boolean aplicaDescontoDe(double porcentagem);

	
	default boolean aplicaDescontoDe10Porcento(){
		System.out.println("Acessando interface Promocional");
		return aplicaDescontoDe(0.1);
		
	
	}

}

