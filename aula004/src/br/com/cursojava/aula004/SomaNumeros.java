package br.com.cursojava.aula004;

import java.util.Scanner;

public class SomaNumeros {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero1 =0;
		int numero2 =0;
		do {
			System.out.println("Por favor digite o primeiro n�mero");
			numero1 = Integer.parseInt(teclado.nextLine());
			
			System.out.println("Por favor digite o segundo n�mero");
			numero2 = Integer.parseInt(teclado.nextLine());
			
			if (numero1 >= numero2) {
				System.out.println("O segundo n�mero precisa ser maior que o primeiro!");
			}			
			
		} while (numero1 >= numero2);
		System.out.printf("N�meros contidos entre %d e %d", numero1, numero2);
		for (int i = numero1+1; i < numero2; i++) {
			System.out.print(i + " ");
		}
		teclado.close();
	}

}
