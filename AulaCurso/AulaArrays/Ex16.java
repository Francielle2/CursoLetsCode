package AulaArrays;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
//Fa�a um algoritmo que, dado um vetor de 50 n�meros, imprimi-lo na ordem inversa � da leitura.  
		
		Scanner scanner = new Scanner(System.in);
		
		int[] numero = new int[50];
		
		for (int i = 0; i<numero.length; i++) {
			System.out.println("Informe o "+(i+1)+"� n�mero: ");
			numero[i] = scanner.nextInt();
		}
		System.out.println("Ordem Inversa: ");
		for (int i=50; i>=0; i--) {
			System.out.println(numero[i]);
		}

	}

}
