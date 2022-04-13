package AulaArrays;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
//Faça um algoritmo que carregue um vetor de seis elementos numéricos inteiros, calcule e mostre: 
//a) A quantidade de números pares; 
//b) Quais os números pares; 
//c) A quantidade de números ímpares; 
//d) Quais os números ímpares.  

		Scanner scanner = new Scanner(System.in);
		
		int[] numeros = new int[6];
		int[] numPar = new int[6];
		int[] numImpar = new int[6];
		
		int qtd = 0;
		int qtdImpar = 0;
		
		for (int x=0; x<numeros.length; x++) {
			System.out.println("Informe o "+(x+1)+"º número: ");
			numeros[x] = scanner.nextInt();
		}
			System.out.print("Números do vetor: ");
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
			System.out.println("A quantidade de números pares é: "+qtd);	
			System.out.println("A quantidade de números impares é: "+qtdImpar);
		}
	}