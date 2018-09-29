package br.com.cursojava.ProvaPriscilla;

import java.util.Scanner;

public class Questao09 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Por favor digite o valor do produto");
		double valor = Double.parseDouble(teclado.nextLine());
		double desconto =0;
		int descontoPercent =0;
		if (0 < valor && valor < 1800.01) {
			desconto = (valor * 11)/100;
			descontoPercent=11;
		} else if (valor <= 2500) {
			desconto = (valor * 15)/100;
			descontoPercent =15;
		} else if (valor > 2500) {
			desconto = (valor * 18)/100;
			descontoPercent = 18;
		}
		System.out.printf("O desconto percentual é de %d, valor do desconto é de %.2f e o valor liquido é %.2f",
				descontoPercent, desconto, (valor - desconto));
		teclado.close();
	}

}
