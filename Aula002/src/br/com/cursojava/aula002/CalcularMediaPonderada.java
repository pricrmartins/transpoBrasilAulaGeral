package br.com.cursojava.aula002;

import java.util.Scanner;

public class CalcularMediaPonderada {
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		double nota1 =0;
		double nota2=0;
		double nota3 =0;
		
		System.out.println("Olá, por favor insira a primeira nota:");
		
		nota1 = Double.parseDouble(teclado.nextLine());
		
		System.out.println("Olá, por favor insira a segunda nota:");
		
		nota2 = Double.parseDouble(teclado.nextLine());
		
		System.out.println("Olá, por favor insira a terceira nota:");
		
		nota3 = Double.parseDouble(teclado.nextLine());

		System.out.printf("A média entra as notas %.2f, %.2f, %.2f é %.2f ",nota1, nota2, nota3, (((nota1 * 2)+(nota2 * 3)+(nota3 * 5))/10));
		
		
		teclado.close();
	}
}
