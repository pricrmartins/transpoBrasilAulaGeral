package br.com.cursojava.aula002;

import java.util.Scanner;

public class CalcularNota {
	public static void main(String[] args){
		double nota1 =0;
		double nota2=0;
		double nota3 =0;
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Olá, por favor insira a primeira nota:");
		
		nota1 = Double.parseDouble(teclado.nextLine());
		
		System.out.println("Olá, por favor insira a segunda nota:");
		
		nota2 = Double.parseDouble(teclado.nextLine());
		
		System.out.println("Olá, por favor insira a terceira nota:");
		
		nota3 = Double.parseDouble(teclado.nextLine());
		teclado.close();
		System.out.printf("A média entra as notas %.2, f%.2f, %.2f é %.2f ",nota1, nota2, nota3, (nota1+nota2+nota3)/3);
	}
}
