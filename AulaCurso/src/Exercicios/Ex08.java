package Exercicios;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
//Leia a idade de 20 pessoas e exiba quantas pessoas são maiores de idade.

		Scanner scanner = new Scanner(System.in);
		
		int idade = 0;
		int qtdMaiorIdade = 0;
		
		for (int i=0; i<20; i++) {
			System.out.println("Digite a "+ (i+1) + "ª idade: ");
			idade = scanner.nextInt();

			if(idade >= 18) {
				qtdMaiorIdade ++;
			}
		}				
		System.out.println("A quantidade de pessoas maiores de idade é: " +qtdMaiorIdade);
	}
}