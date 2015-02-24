package br.com.camilalott.exercicios;

import javax.swing.JOptionPane;

/**
 * 5. Ler uma temperatura e a escala (C-Celsius ou F- Fahrenheit ) e convertê-la
 * para a outra escala. Ou seja, se o usuário informar a temperatura em Celsius
 * esta deverá convertida para Fahrenheit e vice-versa. Fórmulas:
 * F = 32 + ((212 − 32) / 100) x C 
 * C = (F-32) x (100/(212-32))
 * 
 * @author Camila
 *
 */
public class Exercicio5 {
	public static void main(String[] args) {

		// Ler a temperatura e qual a escala
		String tipoEscala = JOptionPane
				.showInputDialog("Escolhe o tipo da temperatura:\nF - De Fahrenheit para Celsius\nC - De Celcius para Fahreinheit");

		if (!"c".equalsIgnoreCase(tipoEscala)
				&& !"f".equalsIgnoreCase(tipoEscala)) {
			System.out
					.println("Essa temperatura informada é invalida. Informe C ou F.");
			System.exit(1);
		}

		double temperatura = Double.parseDouble(JOptionPane
				.showInputDialog("Informe os graus da temperatura:"));
		double temperaturaConvertida = 0;

		// sempre coloque a constante. equals porque se ele nao digita nada vai
		// dar erro.
		if ("c".equalsIgnoreCase(tipoEscala)) {
			if (temperatura >= -273.15) {
				temperaturaConvertida = 32 + ((212 - 32) / 100.0) * temperatura;
			} else {
				System.out
						.println("Nao existe temperatura menor do que -273,15° Celsius");
				System.exit(1);
			}
		} else if ("f".equalsIgnoreCase(tipoEscala)) {
			if (temperatura >= 0) {
				temperaturaConvertida = (temperatura - 32.0) * (100.0 / (212.0 - 32.0));
			} else {
				System.out
						.println("Nao existe temperatura menor do que 0° Fahrenheit");
				System.exit(1);
			}
		}

		System.out.println("A temperatura convertida é: "
				+ temperaturaConvertida);

	}

}

// Adicionar as seguintes condicoes, nao existe Fahrenheite menor do que 0
// E Celsius menor que -273,15