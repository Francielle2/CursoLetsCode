package Exercicios;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
//Crie um algoritmo leia um n�mero do usu�rio e exiba a sua tabuada de multiplica��o.

		Scanner scanner = new Scanner(System.in);
		
		int numero = 0;
		
		System.out.println("Informe o n�mero de que deseja saber a tabuada: ");
		numero = scanner.nextInt();
		System.out.println("\n");
		
		for (int i=0; i<10; i++) {
			System.out.println(numero + " x " +(i+1) + " = " + numero*(i+1));
		}
				
	}
}