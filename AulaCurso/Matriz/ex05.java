package Matriz;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
//Leia uma matriz 5x5. Leia tambem um valor X. 
//O programa devera fazer uma busca desse valor na matriz e, ao final, escrever a localizacao (linha e coluna) 
//ou uma mensagem de “nao encontrado”.
		
		Scanner scanner = new Scanner(System.in);

		int matriz[][] = new int[5][5];
		int numero = 0;
		int posicao_linha = 0;
		int posicao_coluna = 0;
		

		System.out.println("Digite o valor que deseja procurar na matriz:");
		numero = scanner.nextInt();

		System.out.printf("Digite os numeros da matriz:\n");
		for(int i=0; i<matriz.length; i++){
			for(int j=0; j<matriz.length; j++){
				System.out.print("Insira a posição [" + i + "][" + j + "]: ");
	            matriz[i][j] = scanner.nextInt();
	            
	            if(numero == matriz[i][j]){
					numero = matriz[i][j];
					posicao_linha = i;
					posicao_coluna = j;
				}  
			}
		}
		System.out.print("\n");
		System.out.println("Matriz:");
		for(int i=0; i<matriz.length; i++){
			for(int j=0; j<matriz.length; j++){
				System.out.printf("[%d]", matriz[i][j]);
			}
		System.out.print("\n");
		}
		System.out.print("\n");
		System.out.printf("O valor informado foi o %d, e ele foi encontrado na linha %d, coluna %d da matriz.", numero, posicao_linha, posicao_coluna);
	}
}
	
