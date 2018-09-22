package br.com.cursojava.aula002;

import java.util.Scanner;

public class CalcularSalario {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.println("Por favor digite o seu salário");
		double salario = Double.parseDouble(teclado.nextLine());
		double salarioComDescontoInss = salario - (salario * 11) / 100;

		if (salarioComDescontoInss > 3600) {
			System.out.printf("Salario inicial: %.2f, desconto INSS: %.2f,"
					+ "\n valor do desconto IR: %.2f e percentual: 32%%"
					+ ",\n salario liquido: %.2f",salario, salarioComDescontoInss,
					(salarioComDescontoInss*32 )/100, salarioComDescontoInss- ((salarioComDescontoInss*32 )/100));
		} else if (salarioComDescontoInss > 2400) {
			System.out.printf("Salario inicial: %.2f, desconto INSS: %.2f,"
					+ "\n valor do desconto IR: %.2f e percentual: 24%%"
					+ ",\n salario liquido: %.2f",salario, salarioComDescontoInss,
					(salarioComDescontoInss*24 )/100, salarioComDescontoInss- ((salarioComDescontoInss*24)/100));
		} else if (salarioComDescontoInss > 1800) {
			System.out.printf("Salario inicial: %.2f, desconto INSS: %.2f,"
					+ "\n valor do desconto IR: %.2f e percentual: 7.5%%"
					+ ",\n salario liquido: %.2f",salario, salarioComDescontoInss,
					(salarioComDescontoInss*7.5 )/100, salarioComDescontoInss- ((salarioComDescontoInss*7.5 )/100));
		}else{
			System.out.printf("Salario inicial: %.2f, desconto INSS: %.2f,"
					+ "\n valor do desconto IR: %.2f e percentual:0%%"
					+ ",\n salario liquido: %.2f",salario, salarioComDescontoInss,
					(salarioComDescontoInss*0 )/100, salarioComDescontoInss- ((salarioComDescontoInss*0 )/100));
		}
		teclado.close();

	}

}
