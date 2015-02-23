package br.com.camilalott.exercicios;
import javax.swing.JOptionPane;

/**
 * 6. Ler o número de horas trabalhadas e o valor da hora do professor e
 * imprimir o salário bruto e líquido, sabendo que o desconto do IR segue a
 * fórmula: Salário menor ou igual a R$ 1200,00 – desconto ZERO Salário maior
 * que R$1200,00 e menor ou igual a R$ 1800,00 – desconto de 10% Salário maior
 * que R$1800,00 e menor ou igual a R$ 2200,00 – desconto de 15% Salário maior
 * que R$2200,00 – desconto de 27,5%
 * 
 * @author Camila
 *
 */
public class Exercicio5 {
	public static void main(String[] args) {

		// Ler o numero de horas e valor da hora
		int numeroHoras = Integer.parseInt(JOptionPane
				.showInputDialog("Informe o numero de horas trabalhadas:"));
		double valorHora = Double.parseDouble(JOptionPane
				.showInputDialog("Informe o valor da hora trabalhada:"));

		// Calcular Salario Bruto
		double salarioBruto = numeroHoras * valorHora;

		// Calcular salario Liquido, desconto de Imposto de renda
		double salarioLiquido = 0;
		if ((salarioBruto > 1200) && (salarioBruto <= 1800)) {
			salarioLiquido = salarioBruto - (salarioBruto * 0.10);
		}
		if ((salarioBruto > 1800) && (salarioBruto <= 2200)) {
			salarioLiquido = salarioBruto - (salarioBruto * 0.15);
		}
		if (salarioBruto > 2200) {
			salarioLiquido = salarioBruto - (salarioBruto * 0.275);
		}

		System.out.println("O salario bruto é: " + salarioBruto
				+ "\nEo salario liquido é: " + salarioLiquido);
	}
}
