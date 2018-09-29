package br.com.cursojava.aula003;

import java.util.Scanner;

public class MostrarMenorNota {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double menorNota = 330;
		int contador = 0;
		while (contador < 10) {
			System.out.println("Por favor digite uma nota");
			menorNota = Math.min(menorNota, Double.parseDouble(teclado.nextLine()));
			contador++;
		}
		System.out.println("A menor nota é "+menorNota);
		teclado.close();
	}

}
