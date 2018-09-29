package br.com.cursojava.ProvaPriscilla;

import java.util.Scanner;

public class Questao07 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Por favor digite um número");
		int numero = Integer.parseInt(teclado.nextLine());
		System.out.println("O valor elevado a quinta potencia é "+ Math.pow(numero, 5));
		teclado.close();
	}

}
