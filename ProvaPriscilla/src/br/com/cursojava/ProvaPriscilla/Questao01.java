package br.com.cursojava.ProvaPriscilla;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Por favor digite um número.");
		int numero = Integer.parseInt(teclado.nextLine());
		String resultado = numero % 2 == 0? "par" : "impar";
		System.out.println("O número digitado é "+ resultado);
		teclado.close();
	}

}
