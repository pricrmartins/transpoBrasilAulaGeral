package br.com.cursojava.aula002;

import java.util.Scanner;

public class AnoNascimentoBissexto {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		 // 400 4 e n�o 100
		System.out.println("Por favor digite o ano de nascimento");
		int ano = Integer.parseInt(teclado.nextLine());
		
		if ((ano % 400 == 0) || (ano % 4 == 0) && (ano % 100 != 0)) {
			System.out.println("O ano � bissexto");
		}else{
			System.out.println("O ano n�o � bissexto");
		}
		
		teclado.close();
	}

}
