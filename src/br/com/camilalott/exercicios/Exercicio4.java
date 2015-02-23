package br.com.camilalott.exercicios;

import javax.swing.JOptionPane;

/**
 * 
 * 4. Ler uma temperatura em graus Celsius e transformá-la em graus Fahrenheit,
 * segundo a fórmula: F = 32 + ((212 − 32) / 100) x C
 * 
 * @author Camila
 *
 */

public class Exercicio4 {
	public static void main(String[] args) {

		// Ler a temperatura em C
		double temperatura = Double.parseDouble(JOptionPane
				.showInputDialog("Informe a temperatura em graus Cº"));
		
		
		double fahrenheit = 32 + ((212-32) / 100.0) * temperatura;
	
		System.out.println("A temperatura informada em Fahrenheit :" + fahrenheit);
	}
	
}