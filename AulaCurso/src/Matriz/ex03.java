package Matriz;

public class ex03 {

	public static void main(String[] args) {
//Faca um programa que preenche uma matriz 4x4 com o produto do valor da linha e da coluna de cada elemento.
//Em seguida, imprima na tela a matriz.
		
		int matriz[][] = new int[4][4];

		  for(int i=0;i<matriz.length;i++) {
		    for(int j=0;j<matriz.length;j++) {
		        matriz[i][j] = (i+1)*(j+1);
		        System.out.printf("%d  ",matriz[i][j]);
		    }
		    System.out.println("\n");	
		   }
	}
}
