package br.com.cursojava.aula002;

import java.util.Scanner;

public class CalcularIdadeDiasEmAnoMesDia {
// 360 e 30
	public static void main(String[] args){
		Scanner teclado = new Scanner(System.in);
		int idadeDias = -1;
		while(idadeDias < 0){
			System.out.println("Por favor digite a sua idade em dias");
			idadeDias = Integer.parseInt(teclado.nextLine());
			
		}
		
		int idadesAno = idadeDias/360;
		
		int restoEmDias = idadeDias % 360;
		
		int idadesMes = restoEmDias/30;
		 
		int idadesDia = restoEmDias %30;
		
		
		System.out.printf("A sua idade é %d anos, %d meses e %d dias",idadesAno, idadesMes, idadesDia);
		
		teclado.close();
	}
}
