package br.com.cursojava.ProvaPriscilla;

public class Questao04 {

	public static void main(String[] args) {
		
		int numero = 1;
		int valorSomado = 0;
		while (numero <= 50) {
			valorSomado += numero;
			numero ++;
		}
		System.out.println("A somat�ria dos n�meros 1 � 50 � "+ valorSomado);
	}

}
