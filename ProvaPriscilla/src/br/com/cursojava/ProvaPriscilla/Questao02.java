package br.com.cursojava.ProvaPriscilla;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Por favor digite sua idade.");
		int idade = Integer.parseInt(teclado.nextLine());
		System.out.println("Sua idade ap�s 20 anos ser� "+(idade+20));
		teclado.close();

	}

}
