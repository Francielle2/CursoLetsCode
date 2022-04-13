package Matriz;

import java.util.Scanner;

public class Aula {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
			int[][] matrizNotasAlunos = {{7,8,7},{10,8,9},{5,4,3}};
			int[][] matrizDias = {{7,8,7},{10,8,9},{5,4,3}};
			
			
			 for (int[] aluno: matrizNotasAlunos){
				System.out.println("Notas Aluno: ");
			 	for (int nota: aluno){			 		
			 		System.out.println(nota);
			 	}
			 }
			
			/*	
			for (int i=0; i<3; i++) {
					for (int j=0; j<3; j++) {
						System.out.println("Nota " +(j+1)+ ": " + matrizAlunos[i][j]);
					}
					System.out.println("");
			}*/

	}

}