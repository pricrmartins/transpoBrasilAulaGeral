package br.com.cursojava.ProvaPriscilla;

import java.util.Scanner;

public class Questao01 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Por favor digite um n�mero.");
		int numero = Integer.parseInt(teclado.nextLine());
		String resultado = numero % 2 == 0? "par" : "impar";
		System.out.println("O n�mero digitado � "+ resultado);
		teclado.close();
	}

}
