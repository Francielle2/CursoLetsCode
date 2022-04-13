package AulaArrays;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
//Fa�a um algoritmo que carregue um vetor de seis elementos num�ricos inteiros, calcule e mostre: 
//a) A quantidade de n�meros pares; 
//b) Quais os n�meros pares; 
//c) A quantidade de n�meros �mpares; 
//d) Quais os n�meros �mpares.  

		Scanner scanner = new Scanner(System.in);
		
		int[] numeros = new int[6];
		int[] numPar = new int[6];
		int[] numImpar = new int[6];
		
		int qtd = 0;
		int qtdImpar = 0;
		
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
				if (( numeros[i] % 2 == 0)){
					qtd++;
					numPar[i] = numeros[i];
				} else {
					qtdImpar++;
					numImpar[i] = numeros[i];
				}
			}
			System.out.print("Numero Pares: ");
			for (int i=0; i<numeros.length; i++) {
				if(numeros[i] % 2 == 0)
					System.out.print(" "+numeros[i]);
			}
			System.out.println("  ");
			System.out.print("Numero Impares: ");
			for (int i=0; i<numeros.length; i++) {
				if(numeros[i] % 2 != 0)
					System.out.print(" "+numeros[i]);
			}
			System.out.println(" ");
			System.out.println("A quantidade de n�meros pares �: "+qtd);	
			System.out.println("A quantidade de n�meros impares �: "+qtdImpar);
		}
	}