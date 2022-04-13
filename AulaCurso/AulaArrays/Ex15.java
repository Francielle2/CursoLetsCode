package AulaArrays;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
//Faça um algoritmo que carregue um vetor com 10 números reais.
//Calcule e mostre a quantidade de números negativos e a soma dos números positivos desse vetor. 

		Scanner scanner = new Scanner(System.in);
		
		int[] numeros = new int[10];
		int[] numNegativos = new int[10];
		
		int qtd = 0;
		int qtdNegativo = 0;
		int somaPositivos = 0;
		
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
				if (( numeros[i] >= 0)){
					qtd++;
					somaPositivos += numeros[i];
				}
				if ( numeros[i] < 0) {
					qtdNegativo++;
					numNegativos[i] = numeros[i];
				}
			}
			System.out.println("A quantidade de números negativos é: "+qtdNegativo);
			System.out.print("Soma dos Números Positivos: " +somaPositivos);
		}
	}