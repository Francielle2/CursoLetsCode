package AulaArrays;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
//Elabore um algoritmo que leia um vetor A de 30 n�meros inteiros e imprima o maior valor.
		
		Scanner scanner = new Scanner(System.in);
		
		int[] numeros = new int[5];
		int maior = 0;
		
		for (int x=0; x<numeros.length; x++) {
			System.out.println("Informe o "+(x+1)+"� n�mero: ");
			numeros[x] = scanner.nextInt();
		}
			System.out.print("N�meros do vetor: ");
			for(int i=0; i< numeros.length; i++) {
				System.out.printf(" " +numeros[i]);
			}
			System.out.println(" ");
			for (int i=0; i<numeros.length; i++) {			
				if (numeros[i] > maior){
					maior = numeros[i];
				} 
			}
			System.out.println("O maior elemento do vetor � o "+ maior);    

			}	
		}