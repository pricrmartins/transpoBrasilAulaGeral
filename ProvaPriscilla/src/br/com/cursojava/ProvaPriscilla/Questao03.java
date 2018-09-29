package br.com.cursojava.ProvaPriscilla;

import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Por favor digite uma palavra");
		StringBuffer teste = new StringBuffer(teclado.nextLine()); // retirada em: https://docs.oracle.com/javase/7/docs/api/java/lang/StringBuffer.html#reverse%28%29
		System.out.println(teste.reverse());
		teclado.close();

	}

}
