package br.com.cursojava.aula001;

import java.util.ArrayList;

public class Principal {
	public static void main(String[] args){
		/*ArrayList<Integer> lista = new ArrayList<Integer>();
		lista.add(10);
		lista.add(7);
		lista.add(20);
		lista.add(30);
		int min=Integer.MIN_VALUE;
		for (Integer integer : lista) {
			min = Math.min(min, integer);
		}
		*/
		int min = Math.min(Math.min(10, 7), Math.min(20, 30));

		System.out.println("O menor número é:"+min);
		
		/*ArrayList<Integer> listaMaior = new ArrayList<Integer>();
		listaMaior.add(3);
		listaMaior.add(7);
		listaMaior.add(25);
		listaMaior.add(10);
		int max =Integer.MAX_VALUE;
		for (Integer integer : listaMaior) {
			max = Math.max(max, integer);
		}
		*/
		int max = Math.max(Math.max(3, 7), Math.max(25, 20));

		System.out.println("O maior número é:"+max);
		
		double resultado = Math.pow(2, 8);
		
		System.out.println("o valor de 2**8 = "+resultado);
	}
}
