package br.com.cursojava.aula003;

public class MostrarNumeroImpares {

	public static void main(String[] args) {
		int numero=0;
		while (numero <= 100) {
			if (numero % 2 != 0) {
				System.out.println(numero);				
			}
			numero ++;
		}

	}

}
