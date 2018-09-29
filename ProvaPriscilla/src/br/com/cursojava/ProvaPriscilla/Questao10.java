package br.com.cursojava.ProvaPriscilla;

import java.util.Scanner;

public class Questao10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Por favor digite a sua idade");
		int idade = Integer.parseInt(teclado.nextLine());

		System.out.println("\nPor favor digite a sua altura");
		double altura = Double.parseDouble(teclado.nextLine());

		System.out.println("\nPor favor digite o seu peso");
		double peso = Double.parseDouble(teclado.nextLine());

		double IMC = peso / (altura * altura);
		if (IMC > 17) {

			if (IMC < 18.5) {
				System.out.println("IMC - Abaixo do peso");
			} else if (IMC < 25) {
				System.out.println("IMC - Peso normal");

			} else if (IMC < 30) {
				System.out.println("IMC - Acima do peso");

			} else if (IMC < 35) {
				System.out.println("IMC - Obesidade I");

			} else if (IMC < 40) {
				System.out.println("IMC - Obesidade II (severa)");

			} else {
				System.out.println("IMC - Obesidade III (mórbida)");

			}
		}

		teclado.close();
	}

}
