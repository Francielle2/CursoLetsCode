package AulaArrays;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
//Fa�a algoritmo que carregue um vetor com 15 posi��es
//Calcule e mostre: a) O maior elemento do vetor e em que posi��o esse elemento se encontra; 
//b) O menor elemento do vetor e em que posi��o esse elemento se encontra.  

		Scanner scanner = new Scanner(System.in);
		
		int[] numeros = new int[15];
		int maior = 0;
		int menor = 999;
		int posicaoMaior = 0;
		int posicaoMenor = 0;
		
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
					posicaoMaior = i;
				} 
			}
			for (int i=0; i<numeros.length; i++) {			
				if (numeros[i] < menor){
					menor = numeros[i];
					posicaoMenor = i;
				} 
			}
			System.out.println("O maior elemento � o "+ maior+ " e sua posi��o � a: "+(posicaoMaior +1)+" do vetor.");                       
	        System.out.println("O menor elemento � o "+ menor+ " e sua posi��o � a: "+(posicaoMenor +1)+" do vetor.");  

			}	
		}