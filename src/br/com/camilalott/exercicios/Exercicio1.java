package br.com.camilalott.exercicios;

import javax.swing.JOptionPane;

/**
 * Esta primeira linha de marcador, por padrão nunca faça nada nela. Esse é o
 * padrão do JavaDoc. Sempre que for comentar, faça dessa maneira.
 * 
 * Exercício 1. Ler 3 valores inteiros do usuário e mostrar o maior deles, o
 * menor deles e a média.
 * 
 * @author Camila
 * 
 */
public class Exercicio1 {
	public static void main(String[] args) {
		// Lê três numeros do usuário
		int numero1 = Integer.parseInt(JOptionPane
				.showInputDialog("Informe o primeiro número: "));
		int numero2 = Integer.parseInt(JOptionPane
				.showInputDialog("Informe o segundo número: "));
		int numero3 = Integer.parseInt(JOptionPane
				.showInputDialog("Informe o terceiro número: "));

		// Mostrar o numero maior
		int maior = numero1;

		if (numero2 > maior) {
			maior = numero2;
		}

		if (numero3 > maior) {
			maior = numero3;
		}

		JOptionPane.showMessageDialog(null, "O maior número é: " + maior);

		System.out.println("O maior número é:" + maior);

		/*
		 * NAO FAZER ISSO EM CODIGO DE PRODUCAO, POLUI O CODIGO, E TORNANDO MAIS
		 * DIFICIL. int maior =0;
		 * 
		 * if(numero1>=numero2){ maior = numero1; }else{ maior = numero2; }
		 * 
		 * if(numero3>maior){ maior = numero3;
		 */
		// Mostrar o numero menor

		int menor = numero1;

		if (numero2 < menor) {
			menor = numero2;
		}

		if (numero3 < menor) {
			menor = numero3;
		}

		JOptionPane.showMessageDialog(null, "O menor número é: " + menor);

		// Mostrar a media dos 3 numeros
		// Como os numero sao inteiros, se for dividir só por 3, o Java entende
		// que a reposta será em inteiro e trunca a casa decimal. Para quebrar
		// isso basta colocar o numero da divisao em double. Ex: 3.0
		double media = 0.0;
		media = ((numero1 + numero2 + numero3) / 3.0);

		JOptionPane.showMessageDialog(null, "A média é: " + media);

		System.out.println(media);
	}
}
