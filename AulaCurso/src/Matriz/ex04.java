package Matriz;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
//Leia uma matriz 4 x 4, imprima a matriz e retorne a localizacao (linha e a coluna) do maior valor.
			
	Scanner scanner = new Scanner(System.in);

	int matriz[][] = new int[4][4];
	int maior = 0;
	int posicao_linha = 0;
	int posicao_coluna = 0;

	System.out.printf("Digite os numeros da matriz:\n");
	for(int i=0; i<matriz.length; i++){
		for(int j=0; j<matriz.length; j++){
			System.out.print("Insira a posição [" + i + "][" + j + "]: ");
               matriz[i][j] = scanner.nextInt();
			
			if(maior < matriz[i][j]){
				maior = matriz[i][j];
				posicao_linha = i;
				posicao_coluna = j;
			}
		}
	}
	System.out.println("Matriz:");
	for(int i=0; i<matriz.length; i++){
		for(int j=0; j<matriz.length; j++){
			System.out.printf("[%d]", matriz[i][j]);
		}
	System.out.print("\n");
	}
	System.out.printf("O maior valor digitado foi %d, na linha %d, coluna %d ", maior, posicao_linha, posicao_coluna);
  }
}
