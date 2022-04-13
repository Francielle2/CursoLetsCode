package OrientacaoObjeto;

import java.util.Scanner;

public class Ex02 {
/*Nesta atividade vocês deverão criar uma classe Livro com os seguintes atributos:
Título, Nome do Leitor, Quantidade de páginas total, Quantidade de páginas lidas

Este livro deverá ter os seguintes métodos:

​​Criar um método para verificar o progresso do livro, ele deverá calcular a porcentagem de leitura do livro até o momento e retornar a mensagem: “Você já leu X% do livro”.
Após criar a classe Livro, vocês devem criar uma classe Main com os seguintes passos: 
Receber informações pela entrada do teclado dos atributos da classe
Logo em seguida chamar o método para verificar o progresso da leitura do livro */

	public static class livro {
        String titulo;
        String nomeLeitor;
        int qtdPaginasTotal;
        int qtdPaginasLidas;

        livro(){     	
        }

        livro(String titulo, String nomeLeitor, int qtdPaginasTotal, int qtdPaginasLidas){
            this.titulo = titulo;
            this.nomeLeitor = nomeLeitor;
            this.qtdPaginasTotal = qtdPaginasTotal;
            this.qtdPaginasLidas = qtdPaginasLidas;
        }

        public float getProgressoLivro(int qtdPaginasLidas) {
        	this.qtdPaginasLidas = qtdPaginasLidas;
            System.out.println("Quantidade total de páginas do livro: "+this.qtdPaginasTotal);
            System.out.println("Você está na página: "+this.qtdPaginasLidas);
            return 
            	((float)this.qtdPaginasLidas / (float)this.qtdPaginasTotal)*100;
        }
        
    public static void main(String[] args) {
    	
    	livro livro = new livro();
    	   	
    	Scanner scanner = new Scanner(System.in);
  
	    System.out.print("Digite o nome do leitor:");
	    livro.nomeLeitor = scanner.nextLine();
	    
	    System.out.print("Título do livro:");
	    livro.titulo = scanner.nextLine();
	    
	    System.out.print("Total de páginas do livro:");
	    livro.qtdPaginasTotal = scanner.nextInt();
	    scanner.nextLine();
	
	    System.out.println("\nQuantas páginas já foram lidas do livro: "+ livro.titulo);
	    float percentual = livro.getProgressoLivro(scanner.nextInt());
	    scanner.nextLine();
	    System.out.printf("Você já leu %.2f%% do livro.", percentual);
	    }
	}
}