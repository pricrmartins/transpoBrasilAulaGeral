package br.com.cursojava.aula003;

import java.util.Scanner;

public class CalcularMediaNota {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int contador = 0;
		double nota = 0;
		while (contador < 20) {

			System.out.println("Por favor digite uma nota");

			nota += Double.parseDouble(teclado.nextLine());
			contador++;
		}
		System.out.println("A média das notas é "+(nota/20));
		teclado.close();
	}

}
