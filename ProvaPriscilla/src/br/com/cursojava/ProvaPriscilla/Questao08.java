package br.com.cursojava.ProvaPriscilla;

public class Questao08 {

	public static void main(String[] args) {
		int numero = 2;
		while (numero <= 50) {
			int aux =2;
			boolean primo = true;
			while( aux < numero)
			{
				if(numero % aux ==0 || numero ==1)
				{
					primo = false;
					break;
				}
				aux ++;
			}
			if(primo)
			{
				System.out.printf("O número %d é primo \n", numero);
			}
			numero ++;
		}

	}

}
/* for (int i = 0; i < n.length; i++) {
                    boolean primo = true;    
                    for (int j = 2; j < n[i]; j++) {
                        if (n[i] % j == 0) {
                            primo = false;    
                            break;    
                        }    
                    }    
                    if (primo == true) {    
                        System.out.println(n[i] + " é primo. Posição no vetor: " + i);
                    }    
                }    */