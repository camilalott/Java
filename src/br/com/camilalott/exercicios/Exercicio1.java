package br.com.camilalott.exercicios;

import javax.swing.JOptionPane;

/**
 * Esta primeira linha de marcador, por padrão nunca faça nada nela. Esse é o padrão do JavaDoc.
 * Sempre que for comentar, faça dessa maneira.
 * 
 * Exercício 1. Ler 3 valores inteiros do usuário e mostrar o maior deles, o menor deles e a média. 
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
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Informe um primeiro número inteiro: "));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Informe um segundo número inteiro: "));
		numero3 = Integer.parseInt(JOptionPane.showInputDialog("Informe um terceiro número inteiro: "));
		
		if((numero1>=numero2) && (numero1>=numero3)){
			maior = numero1;
			
		}
		if((numero2>=numero1) && (numero2>=numero3)){
			maior = numero1;
			
		}
	
	
	}
		
	}
