package Exercicios;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
//Leia o nome e a idade de 10 pessoas e exiba o nome da pessoa mais nova
		
		Scanner scanner = new Scanner(System.in);
		String nome;
		int idade = 0;
		
		String nomePessoaMaisNova = null;
		int idadePessoaMaisNova = 0;
		
		for (int i=0; i<3; i++) {		
			System.out.println((i+1)+ "- Digite seu nome:");
			nome = new Scanner(System.in).nextLine();
			System.out.println((i+1)+ "- Digite sua idade");
			idade = new Scanner(System.in).nextInt();
//			scanner.nextLine();
			
			if(i == 0) {
				nomePessoaMaisNova = nome;
				idadePessoaMaisNova = idade;
			}
			
			if(idade < idadePessoaMaisNova) {
				nomePessoaMaisNova = nome;
				idadePessoaMaisNova = idade;
				
			}
			
		}
		
		System.out.println("A pessoa mais nova é: "+ nomePessoaMaisNova + " com " +idadePessoaMaisNova + " anos.");

	}

}
