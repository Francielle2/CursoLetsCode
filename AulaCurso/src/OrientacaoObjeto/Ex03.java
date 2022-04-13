package OrientacaoObjeto;

import java.util.Scanner;

import OrientacaoObjeto.Ex02.livro;

public class Ex03 {
/*Nesta atividade vocês deverão criar uma classe Veículo com os seguintes atributos:
Modelo, Marca, Ano, Velocidade Máxima, Cor, Valor FIPE

Este Veículo deverá ter os seguintes métodos:
Imprimir “Marca, Modelo, Ano”
Método para adicionar velocidade recebendo o valor por parâmetro
Caso o valor da velocidade seja maior do que o máximo permitido, deverá imprimir a seguinte mensagem: “Velocidade acima do valor permitido para o veículo”. Caso o valor seja aceito, deverá exibir a mensagem: “Estou acelerando {quantidade} km/h”
Método para frear o veículo e exibir a mensagem: “Estou freando o veículo {modelo do veículo}"
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
	    
	    System.out.print("Digite a velocidade máxima do carro:");
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
                    System.out.println("Opção inválida!");
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