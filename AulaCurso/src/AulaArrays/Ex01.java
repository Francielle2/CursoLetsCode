package AulaArrays;

import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args) {
//Fa�a um Programa que leia um vetor de 5 n�meros inteiros e mostre-os. 
		
		Scanner scanner = new Scanner(System.in);
		
		int[] numeros = new int[5];
		for (int i=0; i < numeros.length; i++) {
			System.out.println(i+ "- Digite um n�mero: ");
			numeros[i] = scanner.nextInt();
		}
		
		System.out.print("\n Numeros digitados: ");
		for(int numero: numeros) {
			System.out.printf("%d, ",numero);
		}
		
	}

}
