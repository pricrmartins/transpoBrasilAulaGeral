package br.com.cursojava.aula002;

import java.util.Scanner;

public class CalcularArea {
	public static void main(String[] args) {
		// 02
		Scanner teclado = new Scanner(System.in);
		double base = -1;
		double altura = -1;
		while (base < 0) {
			System.out.println("Por favor digite o valor da base:");
			base = Double.parseDouble(teclado.nextLine());
		}
		while (altura < 0) {
			System.out.println("Por favor digite o valor da altura:");
			altura = Double.parseDouble(teclado.nextLine());
		}
		teclado.close();
		System.out.println("A área do retângulo é: " + (base * altura)+" e o perímetro é:"+(base + altura)*2);
	}
}
