package Matriz;

public class ex02 {

	public static void main(String[] args) {
//Declare uma matriz 5x5. 
//Preencha com 1 a diagonal principal e com 0 os demais elementos. 
//Escreva ao final a matriz obtida.

		int matriz[][] = new int[5][5];
		
	    for(int i=0 ; i<matriz.length; i++){
	        for(int j=0; j<matriz.length; j++){
	            if(i==j) {
	            	matriz[i][j] = 1;
	            }
	            else {
	            	matriz[i][j] = 0;
	            }
	        }
	     }
	    for(int i=0 ; i<matriz.length; i++){
	        for(int j=0 ; j<matriz.length; j++){
	        	System.out.printf("%d  ", matriz[i][j]);
	        }
	        System.out.println("\n");
	    }
	}
}

