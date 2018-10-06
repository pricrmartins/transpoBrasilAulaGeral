package br.com.cursojava.aula004;

public class Soma50PrimeirosNumeros {

	public static void main(String[] args) {
		int valor = 0;
		for (int i = 1; i <= 50; i++) {
			valor+= i;
			System.out.print(valor +" ");
		}

	}

}
