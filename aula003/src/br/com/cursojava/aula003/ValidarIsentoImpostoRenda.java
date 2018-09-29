package br.com.cursojava.aula003;

import java.util.Scanner;

public class ValidarIsentoImpostoRenda {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Por favor digite o seu salário");
		double salario = Double.parseDouble(teclado.nextLine());
		
		String resultado = salario > 1800? "não é isento":"é isento";
		
		System.out.printf("Você %s do imposto de renda.",resultado);
		
		teclado.close();
	}

}
