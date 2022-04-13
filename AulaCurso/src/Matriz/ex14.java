package Matriz;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class ex14 {

	public static void main(String[] args) {
//Faça um programa para gerar automaticamente numeros entre 0 e 99 de uma cartela de bingo. 
//Sabendo que cada cartela devera conter 5 linhas de 5 numeros, 
//gere estes dados de modo a nao ter numeros repetidos dentro das cartelas. 
//O programa deve exibir na tela a cartela gerada.

		Random random = new Random();
		
		int[][] numero = new int[5][5];
		int[] numerosSorteados = new int[100];
		
		for(int i = 0; i<100;i++) {
			numerosSorteados[i] = -1;
		}
		
		for (int i=0; i<5; i++) {	
			for(int j=0 ; j<5; j++){
				boolean validacao = false;
				do {
					int sorteado = random.nextInt(100);
					validaSeNumeroJaFoiSorteado(numerosSorteados, sorteado);
					if(!validacao) {
						numero[i][j] = sorteado;
						numerosSorteados[sorteado] = sorteado;
					}
			}while(validacao);
		}
	}
		System.out.println("| B | I | N | G | O | \n");
		for (int i=0; i<5; i++) {	
			for(int j=0 ; j<5; j++){
				System.out.printf("%3d  ",numero[i][j]);
			}
			System.out.println("");
		}
		System.out.println();
	    for(int numerosSorteado : numerosSorteados){	        
	        System.out.printf("%3d  ", numerosSorteados);
	    }
	 }
	
	public static boolean validaSeNumeroJaFoiSorteado(int[] vetor, int numeroSorteado) {
		int numero = vetor[numeroSorteado];
		return numero > 0;
	}
	
}

