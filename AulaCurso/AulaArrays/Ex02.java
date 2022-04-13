package AulaArrays;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
//Faça   um   Programa   que   leia   um   vetor   de   10   números   reais   e   mostre-os   na   ordem inversa. 

		int[] numeros = new int[10];
		
		Scanner scanner = new Scanner(System.in);
		
		for (int i=0; i < numeros.length; i++) {
			numeros[i] = scanner.nextInt();
		}
		//conta ao contrario
		for (int i=9; i>=0; i--) {
			System.out.println(numeros[i]);
		}
		
	}

}
