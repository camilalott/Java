package br.com.camilalott.exercicios;

import javax.swing.JOptionPane;

/**
 * 2. Ler 3 valores numericos e imprimir a soma dos 2 maiores e a diferenca dos
 * menores
 * 
 * @author Camila
 *
 */
public class Exercicio2 {
	public static void main(String[] args) {

		// Ler tres numeros do usuario
		int numero1 = Integer.parseInt(JOptionPane
				.showInputDialog("Informe o primeiro n�mero: "));
		int numero2 = Integer.parseInt(JOptionPane
				.showInputDialog("Informe o segundo n�mero: "));
		int numero3 = Integer.parseInt(JOptionPane
				.showInputDialog("Informe o terceiro n�mero: "));

		// Somar os dois maiores
		int maior = numero1;
		int meio= numero1;
		int menor = numero1;
		
		if (numero2 > maior) {
			meio = maior;
			maior = numero2;
		}else{
			meio = numero2;
		}
		
		if(numero3>maior){
			menor = meio;
			meio = maior;
			maior = numero3;
		}else{
			if(numero3>meio){
				menor = meio;
				meio = numero3;
			}else{
				menor = numero3;
			}
		}
		// Soma dos numero maiores
		int soma = maior + meio;
		JOptionPane.showMessageDialog(null,"A soma dos maiores e: " + soma);
	
		int diferenca = meio - menor;
		JOptionPane.showMessageDialog(null,"A soma dos maiores e: " + diferenca);
	
	}
}