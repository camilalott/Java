package br.com.camilalott.exercicios;

import javax.swing.JOptionPane;

/**
 * Esta primeira linha de marcador, por padr�o nunca fa�a nada nela. Esse � o padr�o do JavaDoc.
 * Sempre que for comentar, fa�a dessa maneira.
 * 
 * Exerc�cio 1. Ler 3 valores inteiros do usu�rio e mostrar o maior deles, o menor deles e a m�dia. 
 * 
 * @author Camila
 * 
 */
public class Exercicio1 {
	public static void main(String [] args){
		
		int numero1;
		int numero2;
		int numero3;
		
		int maior;
		int menor;
		int media;
		double soma;
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Informe um primeiro n�mero inteiro: "));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Informe um segundo n�mero inteiro: "));
		numero3 = Integer.parseInt(JOptionPane.showInputDialog("Informe um terceiro n�mero inteiro: "));
		
		if((numero1>=numero2) && (numero1>=numero3)){
			maior = numero1;
			
		}
		if((numero2>=numero1) && (numero2>=numero3)){
			maior = numero1;
			
		}
	
	
	}
		
	}
