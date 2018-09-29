package br.com.cursojava.ProvaPriscilla;

import java.util.Scanner;

public class Questao05 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double menorNota = 330;
		double maiorNota = 0;
		int contador = 0;
		while (contador < 10) {
			System.out.println("Por favor digite uma nota");
			double nota = Double.parseDouble(teclado.nextLine());
			menorNota = Math.min(menorNota, nota);
			maiorNota = Math.max(maiorNota, nota);
			contador++;
		}
		System.out.println("A menor nota é " + menorNota);
		System.out.println("A maior nota é "+ maiorNota);
		teclado.close();

	}

}
