package Matriz;

import java.util.Scanner;

public class ex20 {

	public static void main(String[] args) {
/*Faca um programa que leia uma matriz 3 x 6 com valores reais.
(a) Imprima a soma de todos os elementos das colunas ımpares.
(b) Imprima a media aritmetica dos elementos da segunda e quarta colunas. 
(c) Substitua os valores da sexta coluna pela soma dos valores das colunas 1 e 2.
(d) Imprima a matriz modificada. */

		Scanner scanner = new Scanner(System.in);
		
		float matriz[][] = new float[3][6];
		
		float soma = 0;
	    float media;
	    int qtdNumeros = 0;
		
		System.out.printf("Digite os numeros da Matriz:\n");
		for(int i=0; i<3; i++){
			for(int j=0; j<6; j++){	
				System.out.print("Insira a posição [" + i + "][" + j + "]: ");
	               matriz[i][j] = scanner.nextInt();
			}
		}
		System.out.println("");
		System.out.println("Matriz:");
        for (float[] numero : matriz){
            for (float valor : numero){
                System.out.printf("%6.2f ",valor);
            }
            System.out.println();
        }
        System.out.println("");
        for (float[] numero : matriz) {
            for (int j = 0; j < numero.length; j++) {
                if (j % 2 == 0){
                    soma += numero[j];
                }
            }
        }
        System.out.printf("A soma de todos os elementos das colunas ímpares é: %.2f\n",soma);

        for (float[] numero : matriz) {
            for (int j = 0; j < numero.length; j++) {
                if (j == 1 || j == 3) {
                    soma += numero[j];
                    qtdNumeros++;
                }
            }
        }
        media = soma / qtdNumeros;
        System.out.printf("A media de todos os elementos das colunas 2 e 4 é: %.2f\n",media);
        
        System.out.println("");
        System.out.println("Nova Matriz:");
        for (float[] numero : matriz) {
            numero[5] = (numero[0] + numero[1]);
            for (float valor : numero){
                System.out.printf("%5.2f ",valor);
            }
            System.out.println();
        }
        
	}
}