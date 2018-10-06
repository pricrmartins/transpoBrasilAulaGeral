package br.com.cursojava.aula004;

public class NumerosParesEntre100E200 {

	public static void main(String[] args) {
		for (int i = 100; i <= 200; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
	}

}
