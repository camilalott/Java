package br.com.camilalott.exercicios;

import javax.swing.JOptionPane;

/**
 * Esta primeira linha de marcador, por padrao nunca faca nada nela. Esse e o
 * padrao do JavaDoc. Sempre que for comentar, faca dessa maneira.
 * 
 * Exercicio 1. Ler 3 valores inteiros do usuario e mostrar o maior deles, o
 * menor deles e a media.
 * 
 * @author Camila
 * 
 */
public class Exercicio1 {
	public static void main(String[] args) {
		// Ler tres numeros do usuario
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

		JOptionPane.showMessageDialog(null, "O maior numero e: " + maior);

		System.out.println("O maior numero e:" + maior);


		int menor = numero1;

		if (numero2 < menor) {
			menor = numero2;
		}

		if (numero3 < menor) {
			menor = numero3;
		}

		JOptionPane.showMessageDialog(null, "O menor numero e: " + menor);

		// Mostrar a media dos 3 numeros
		// Como os numero sao inteiros, se for dividir s� por 3, o Java entende
		// que a reposta ser� em inteiro e trunca a casa decimal. Para quebrar
		// isso basta colocar o numero da divisao em double. Ex: 3.0
		double media = 0.0;
		media = ((numero1 + numero2 + numero3) / 3.0);

		JOptionPane.showMessageDialog(null, "A media e: " + media);

		System.out.println(media);
	}
}
