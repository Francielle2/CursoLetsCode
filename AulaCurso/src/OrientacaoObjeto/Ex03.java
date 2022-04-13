package OrientacaoObjeto;

import java.util.Scanner;

import OrientacaoObjeto.Ex02.livro;

public class Ex03 {
/*Nesta atividade voc�s dever�o criar uma classe Ve�culo com os seguintes atributos:
Modelo, Marca, Ano, Velocidade M�xima, Cor, Valor FIPE

Este Ve�culo dever� ter os seguintes m�todos:
Imprimir �Marca, Modelo, Ano�
M�todo para adicionar velocidade recebendo o valor por par�metro
Caso o valor da velocidade seja maior do que o m�ximo permitido, dever� imprimir a seguinte mensagem: �Velocidade acima do valor permitido para o ve�culo�. Caso o valor seja aceito, dever� exibir a mensagem: �Estou acelerando {quantidade} km/h�
M�todo para frear o ve�culo e exibir a mensagem: �Estou freando o ve�culo {modelo do ve�culo}"
 */
	public static class veiculo {
        String modelo;
        String marca;
        int ano;
        double velocidadeMaxima;
        String cor;
        double valorFipe;
        double velocidade;        
        
        veiculo(){     	
        }

        veiculo(String modelo, String marca, int ano, double velocidadeMaxima, String cor, double valorFipe, double velocidade){
            this.modelo = modelo;
            this.marca = marca;
            this.ano = ano;
            this.velocidadeMaxima = velocidadeMaxima;
            this.cor = cor;
            this.valorFipe = valorFipe;
            this.velocidade = velocidade;
        }
        
        public void mostrar(){
            System.out.println("\nVeiculo: "+this.modelo+
                    "\nMarca: "+this.marca+
                    "\nCor: "+this.cor);
        }
        
        public void acelerar(double valor) {
    		if((this.velocidade + valor) < velocidadeMaxima) {
    			System.out.println("Estou acelerando...");
    			this.velocidade += valor;
    			System.out.println("Velocidade atual: " +this.velocidade);
    	} else {
            System.out.println("Velocidade acima do valor permitido para o veiculo");
    		}
        }
        
        public void frear(int valor){
            this.velocidade -= valor;
            System.out.println("Estou freando o veiculo "+this.modelo);
            System.out.println("Velocidade atual: "+this.velocidade+"km/h");
        }
        
    public static void main(String[] args) {
    	
    	veiculo carro = new veiculo();
    	   	
    	Scanner scanner = new Scanner(System.in);
  
	    System.out.print("Digite o modelo do carro:");
	    carro.modelo = scanner.nextLine();
	    
	    System.out.print("Digite a marca do carro:");
	    carro.marca = scanner.nextLine();
	    
	    System.out.print("Digite a cor do carro:");
	    carro.cor = scanner.nextLine();
	    
	    System.out.print("Digite o ano do carro:");
	    carro.ano = scanner.nextInt();
	    
	    System.out.print("Digite a velocidade m�xima do carro:");
	    carro.velocidadeMaxima = scanner.nextInt();

	    System.out.print("Qual o valor da tabela fipe do carro:");
	    carro.valorFipe = scanner.nextInt();
	    
	    boolean continuar = true;
        while(continuar) {
            carro.mostrar();
            System.out.println();
            System.out.println("Menu: " +
                    "\n1 - Para Acelerar?" +
                    "\n2 - Para Frear?");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1 :
                    System.out.println("Qual a velocidade?");
                    int velocidade = scanner.nextInt();
                    scanner.nextLine();
                    carro.acelerar(velocidade);
                    break;
                case 2 :
                    System.out.println("Qual a velocidade?");
                    int velocidadeMenor = scanner.nextInt();
                    scanner.nextLine();
                    carro.frear(velocidadeMenor);
                    break;
                default :
                    System.out.println("Op��o inv�lida!");
            }

            System.out.println("\nDeseja continuar? 'S' ou 'N'");
            String resp = scanner.nextLine();
            if (!resp.equalsIgnoreCase("S")){
                continuar = false;
            }
        }
    }
  }
}