package br.com.camilalott.exercicios;

import javax.swing.JOptionPane;

/**
 * Esta primeira linha de marcador, por padr�o nunca fa�a nada nela. Esse � o
 * padr�o do JavaDoc. Sempre que for comentar, fa�a dessa maneira.
 * 
 * Exerc�cio 1. Ler 3 valores inteiros do usu�rio e mostrar o maior deles, o
 * menor deles e a m�dia.
 * 
 * @author Camila
 * 
 */
public class Exercicio1 {
	public static void main(String[] args) {
		// L� tr�s numeros do usu�rio
		int numero1 = Integer.parseInt(JOptionPane
				.showInputDialog("Informe o primeiro n�mero: "));
		int numero2 = Integer.parseInt(JOptionPane
				.showInputDialog("Informe o segundo n�mero: "));
		int numero3 = Integer.parseInt(JOptionPane
				.showInputDialog("Informe o terceiro n�mero: "));

		// Mostrar o numero maior
		int maior = numero1;

		if (numero2 > maior) {
			maior = numero2;
		}

		if (numero3 > maior) {
			maior = numero3;
		}

		JOptionPane.showMessageDialog(null, "O maior n�mero �: " + maior);

		System.out.println("O maior n�mero �:" + maior);

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

		JOptionPane.showMessageDialog(null, "O menor n�mero �: " + menor);

		// Mostrar a media dos 3 numeros
		// Como os numero sao inteiros, se for dividir s� por 3, o Java entende
		// que a reposta ser� em inteiro e trunca a casa decimal. Para quebrar
		// isso basta colocar o numero da divisao em double. Ex: 3.0
		double media = 0.0;
		media = ((numero1 + numero2 + numero3) / 3.0);

		JOptionPane.showMessageDialog(null, "A m�dia �: " + media);

		System.out.println(media);
	}
}
