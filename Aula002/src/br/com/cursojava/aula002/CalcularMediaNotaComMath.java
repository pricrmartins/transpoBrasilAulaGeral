package br.com.cursojava.aula002;

import java.util.Scanner;

public class CalcularMediaNotaComMath {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Por favor digite a primeira nota");
		double nota1 = Double.parseDouble(teclado.nextLine());
		
		System.out.println("Por favor digite a segunda nota");
		double nota2 = Double.parseDouble(teclado.nextLine());
		
		System.out.println("Por favor digite a terceira nota");
		double nota3 = Double.parseDouble(teclado.nextLine());
		
		System.out.println("A maior nota é "+Math.max(Math.max(nota1, nota2), nota3));
		
		System.out.println("A maior nota é "+Math.max(Math.min(nota1, nota2), nota3));
		
		teclado.close();
	}
}
