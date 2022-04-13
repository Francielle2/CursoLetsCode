package Matriz;

import java.util.Random;
import java.util.Scanner;

public class ex21 {

	public static void main(String[] args) {
/*Faca um programa que leia duas matrizes 2x2 com valores reais. 
      Ofereca ao usuario um menu de opcoes:
		(a) somar as duas matrizes
		(b) subtrair a primeira matriz da segunda
		(c) adicionar uma constante as duas matrizes `
		(d) imprimir as matrizes 
Nas duas primeiras opcoes uma terceira matriz 3x3 deve ser criada. 
Na terceira opcao o valor da constante deve ser lido e o resultado da adicao da constante deve ser armazenado na propria matriz.*/
		
		Scanner scanner = new Scanner(System.in);
	
		float matrizA[][] = new float[2][2];
		float matrizB[][] = new float[2][2];
		float matrizC[][] = new float[3][3];
		
		boolean executar = true;
	    int opcao;
		
		System.out.printf("Digite os numeros da Matriz A:\n");
		for(int i=0; i<matrizA.length; i++){
			for(int j=0; j<matrizA.length; j++){	
				System.out.print("Insira a posição [" + i + "][" + j + "]: ");
	               matrizA[i][j] = scanner.nextInt();
				}
			}
		System.out.println("");
		System.out.printf("Digite os numeros da Matriz B:\n");
		for(int i=0; i<matrizB.length; i++){
			for(int j=0; j<matrizB.length; j++){	
				System.out.print("Insira a posição [" + i + "][" + j + "]: ");
	               matrizB[i][j] = scanner.nextInt();
				}
			}
		System.out.println("");
		do{
	        System.out.println("Qual operaçâo deseja executar?");
	        System.out.println("0 - Finalizar o programa.");
	        System.out.println("1 - Somar as Matrizes A e B");
	        System.out.println("2 - Subtrair as Matrizes A e B");
	        System.out.println("3 - Adicionar uma constante as Matrizes A e B");
	        System.out.println("4 - Imprimir as Matrizes");

	        opcao = scanner.nextInt();
	        scanner.nextLine();
	
	        switch (opcao) {
	            case 0 :
	                System.out.println("0 - Finalizar o programa\n");
	                executar = false;
	                break;
	            case 1 :
	                System.out.println("Soma:");
	                for (int i = 0; i < matrizC.length; i++){
	                    for (int j=0; j < matrizC[i].length; j++){
	                        if (i < matrizA.length && j < matrizA.length){
	                            matrizC[i][j] = (matrizA[i][j] + matrizB[i][j]);
	                        } else {
	                            matrizC[i][j] = 0;
	                        }
	                        System.out.printf("%3.0f ",matrizC[i][j]);
	                    }
	                    System.out.println();
	                }
	                break;
	            case 2:
	                System.out.println("Subtração:");
	                for (int i = 0; i < matrizC.length; i++){
	                    for (int j=0; j < matrizC[i].length; j++){
	                        if (i < matrizA.length && j < matrizA.length){
	                            matrizC[i][j] = (matrizB[i][j] - matrizA[i][j]);
	                        } else {
	                            matrizC[i][j] = 0;
	                        }
	                        System.out.printf("%3.0f ",matrizC[i][j]);
	                    }
	                    System.out.println();
	                }
	                break;
	            case 3 :
	                System.out.println("Digite a Constante:");
	                int constante = scanner.nextInt();
	                scanner.nextLine();
	                for (int i = 0; i < matrizA.length; i++){
	                    for (int j=0; j < matrizA[i].length; j++){
	                        matrizA[i][j] = (matrizA[i][j] + constante);
	                        matrizB[i][j] = (matrizB[i][j] + constante);
	                    }
	                }
	                System.out.println("Matriz A Resultante:");
	                for (float[] numero : matrizA){
	                    for (float valor : numero){
	                        System.out.printf("%3.0f ",valor);
	                    }
	                    System.out.println();
	                }
	                System.out.println("Matriz B Resultante:");
	                for (float[] numero : matrizB){
	                    for (float valor : numero){
	                        System.out.printf("%3.0f ",valor);
	                    }
	                    System.out.println();
	                }
	                break;
	            case 4 :
	                System.out.println("Matriz A:");
	                for (float[] numero : matrizA){
	                    for (float valor : numero){
	                        System.out.printf("%3.0f ",valor);
	                    }
	                    System.out.println();
	                }
	                System.out.println("Matriz B:");
	                for (float[] numero : matrizB){
	                    for (float valor : numero){
	                        System.out.printf("%3.0f ",valor);
	                    }
	                    System.out.println();
	                }
	   /*             System.out.println("Matriz C:");
	                for (float[] numero : matrizC){
	                    for (float valor : numero){
	                        System.out.printf("%3.0f ",valor);
	                    }
	                    System.out.println();
	                }*/
	                break;
	            default :
	                System.out.println("Opção Inválida!.\n");
	        }
	
	        if (opcao > 0 && opcao < 5){
	            System.out.println("\nDeseja continuar? ( S ) ( N )");
	            String continuar = scanner.next();
	            if (continuar.toUpperCase().charAt(0) != 'S'){ executar = false; }
	            }
	        } while (executar);
	    }
	}
