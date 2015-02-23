package br.com.camilalott.exercicios;

/**
 * 3. Ler dois valores de hora, minuto e segundo (h1, m1, s1, h2, m2, s2). Em
 * seguida imprimir o intervalo entre esses dois horários em hora, minuto e
 * segundo. Dica: converta os horários lidos para segundos, calcule a diferença
 * e converta a diferença em hora, minuto e segundo.
 * 
 * @author Camila
 *
 */
public class Exercicio3 {
	public static void main(String[] args) {

		// Ler as horas, minutos e segundos. Seis variaveis.
		int h1 = 40;	
		int m1 = 30;
		int s1 = 4;
		int h2 = 2;
		int m2 = 40;
		int s2 = 3;

		// Converter os horarios em segundos. Atencao repita esse processo para
		// o segundo horario.
		// Cada hora tem 60 minutos. Minuto = 60 segundos. Hora = 3600 segundos
		// Pegue a quantidade de horas multiplique por 3600 = Quantidade de
		// segundos.
		// Pegue a quantidade de minutos e multiplique por 60 = Quantidade de
		// segundos.
		// Agora some todos os segundos, os das horas, os dos minutos e os
		// segundos.

		s1 = s1 + (h1 * 3600);
		s1 = s1 + (m1 * 60);

		s2 = s2 + (h2 * 3600);
		s2 = s2 + (m2 * 60);

		// Calcular a diferenca de segundos
		// A diferenca do s1 e do s2.

		int diferenca = s1 - s2;

		// Converter para hora e minuto.
		// Pegue a quantidade da diferenca de segundos e dividi 3.600 = horas
		// Pegue a quantidade da diferenca de segundos e dividi por 60 =
		// minutos.

		int horaFinal = diferenca / 3600;
		int resto = diferenca % 3600;
		int minutoFinal = resto / 60;
		int segundoFinal = resto % 60;

		// Imprimir valores
		System.out.printf("%02d:%02d:%02d", horaFinal, minutoFinal, segundoFinal);

	}
}
