package AulaArrays;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
//Fa�a um programa que leia um vetor de 5 n�meros inteiros, mostre a soma, multiplica��o e os n�meros.

		Scanner scanner = new Scanner(System.in);
		
		int[] vetNumero = new int[5];
		int somaNumeros = 0;
		int multNumeros = 1;
		
		for (int i=0; i<vetNumero.length; i++) {
			System.out.println("Digite o "+(i+1)+ "� n�mero do vetor: ");
			vetNumero[i] = scanner.nextInt();
			somaNumeros += vetNumero[i];
			multNumeros *= vetNumero[i];
		}
		System.out.println("Soma dos n�meros digitados: " +somaNumeros);
        System.out.println("Multiplica��o dos n�meros digitados: " +multNumeros);
        
        System.out.print("N�meros do Vetor: ");
		for(int numero: vetNumero) {
		System.out.printf("%d ",numero);
		}
        
		}
		
}
