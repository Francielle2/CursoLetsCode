package Matriz;

import java.util.Random;
import java.util.Scanner;

public class ex25 {
	
    private static int[][] velha = new int[3][3];
    private static int jogador = 1;
    private static int linha = 0;
    private static int coluna = 0;

    public static String mostrarTabuleiro() {
    	
        String peca = "";
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                switch (velha[i][j]) {
                    case 0: 
                    	peca = "_"; 
                    break;
                    case 1: 
                    	peca = "O"; 
                    break;
                    case -1: 
                    	peca = "X"; 
                    break;
                }
                System.out.printf("%3s",peca);
            }
            System.out.println();
        }
        return "";
    }

    public static int existeVencedor() {

        for (int i = 0; i < 3; i++) {
            if ((velha[i][0] == velha[i][1]) && (velha[i][0] == velha[i][2])
                    && (velha[i][0] != 0)) {
                return velha[i][0];
            }
        }
        for (int j = 0; j < 3; j++) {
            if ((velha[0][j] == velha[1][j]) && (velha[0][j] == velha[2][j])
                    && (velha[0][j] != 0)) {
                return velha[0][j];
            }
        }
        if ((velha[0][0] == velha[1][1]) && (velha[0][0] == velha[2][2])
                && (velha[0][0] != 0)) {
            return velha[0][0];
        }
        if ((velha[0][2] == velha[1][1]) && (velha[0][2] == velha[2][0])
                && (velha[0][2] != 0)) {
            return velha[0][2];
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (velha[i][j] == 0) {
                    return 0;
                }
            }
        }
        return 2;
    }

    public static boolean jogada(int jogador, int linha, int coluna) {
        if ((linha < 0) || (linha > 2)) {
            return false;
        }
        if ((coluna < 0) || (coluna > 2)) {
            return false;
        }
        if (velha[linha][coluna] != 0) {
            return false;
        }
        velha[linha][coluna] = jogador;
        return true;
    }

    public static void main(String[] args) {
    	
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        
        int vencedor = 0;
        boolean jogar = true;

        System.out.println("\n*** JOGO DA VELHA ***\n");
        System.out.println("Você = 0");
        System.out.println("Computador = X");
        System.out.println("\nVamos Começar!\n");

          do {
            for (int i = 0; i < velha.length; i++) {
                for (int j = 0; j < velha[i].length; j++) {
                    velha[i][j] = 0;
                }
            }
            while (vencedor == 0) {
                if (jogador == 1) {
                    System.out.println("Sua vez! \nEscolha a linha (0, 1 ou 2):");
                    linha = scanner.nextInt();
                    System.out.println("Escolha a coluna (0, 1 ou 2):");
                    coluna = scanner.nextInt();
                    
                    if (jogada(jogador, linha, coluna)) {
                        velha[linha][coluna] = jogador;
                        jogador = -1;
                    } else {
                        System.out.println("Jogada invalida, tente outra vez!");
                    }
                    System.out.println(mostrarTabuleiro());
                    vencedor = existeVencedor();
                } else {
                    System.out.println("Computador jogando.");
                    while (jogador == -1) {
                        linha = random.nextInt(3);
                        coluna = random.nextInt(3);
                        if (jogada(jogador, linha, coluna)) {
                            velha[linha][coluna] = jogador;
                            jogador = 1;
                        }
                    }
                    System.out.println("Jogada efetuada!\n");
                    System.out.println(mostrarTabuleiro());
                    vencedor = existeVencedor();
                }
            }
            switch (vencedor) {
                case 1:
                	System.out.println("Fim de Jogo!");
                    System.out.println("Você ganhou!");
                    break;
                case -1:
                	System.out.println("Fim de Jogo!");
                    System.out.println("O computador ganhou!");
                    break;
                case 2:
                	System.out.println("Fim de Jogo!");
                    System.out.println("Houve um Empate!");
                    break;
                default:
            }
            System.out.println("\nVamos jogar novamente? S/N");
            String x = scanner.next();
            if (x.toUpperCase().equals("S")) {
                vencedor = 0;
            } else {
                jogar = false;
            }
        } while (jogar);
    }
}