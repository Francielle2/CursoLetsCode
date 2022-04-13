package OrientacaoObjeto;

import java.util.Scanner;

public class Ex01 {
/*Nesta atividade voc�s dever�o criar uma classe Funcion�rio com os seguintes atributos:
Nome, Sobrenome, Cidade, Estado, Horas Trabalhadas, Valor Por Hora
Este funcion�rio dever� ter os seguintes m�todos:
Exibir na tela o nome e sobrenome
Adicionar um construtor default e um construtor com os valores para inicializar o objeto
Incrementar quantidade de horas no valor atual de horas trabalhadas
Receber novo valor por hora trabalhada por par�metro e alterar o valor por hora do funcion�rio e logo em seguida exibir o novo valor na tela
M�todo para calcular o sal�rio que o funcion�rio receber� no final do m�s, e em seguida imprimir o valor.
A regra para este c�lculo � horas trabalhadas * o valor por hora
Ap�s criar classe, criar uma classe Main realizando os seguintes passos:
Criar um funcion�rio recebendo pelo terminal as informa��es de cada atributo
Ap�s criar o funcion�rio com as informa��es passadas, exibir um MENU com as op��es:
Incrementar quantidade de horas trabalhadas
Substituir o valor por hora do funcion�rio
Calcular o sal�rio do funcion�rio no final do m�s */
	
	public static class funcionario {
        String nome;
        String sobrenome;
        String cidade;
        String estado;
        double horasTrabalhadas;
        double vlrHora;

        funcionario(){}

        funcionario(String nome, String sobrenome, String cidade, String estado, double horasTrabalhadas, double vlrHora){
            this.nome = nome;
            this.sobrenome = sobrenome;
            this.cidade = cidade;
            this.estado = estado;
            this.horasTrabalhadas = horasTrabalhadas;
            this.vlrHora = vlrHora;
        }

        public void printNomeSobrenome() {
            System.out.println("Funcionario: "+this.nome+" "+this.sobrenome);
        }

        public void incrementaHora(double horasTrabalhadas){
            System.out.println("Horas trabalhadas antes: "+this.horasTrabalhadas +" horas.");
            System.out.println("Horas adicionadas "+horasTrabalhadas +" horas.");
            this.horasTrabalhadas += horasTrabalhadas;
            System.out.println("Saldo final de Horas: "+this.horasTrabalhadas +" horas.");
        }

        public void calcSalario(){
            printNomeSobrenome();
            double salario = this.horasTrabalhadas * this.vlrHora;
            System.out.println("Horas trabalhadas: "+this.horasTrabalhadas +" horas.");
            System.out.println("Valor hora: R$"+this.vlrHora +" reais.");
            System.out.println("Salario final: R$"+salario +" reais.");
        }
    }

    public static void main(String[] args) {
    	
    	Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o nome do funcion�rio: ");
        String nome = entrada.nextLine();
        
        System.out.print("Digite o sobrenome do funcion�rio: ");
        String sobrenome = entrada.nextLine();
        
        System.out.print("Qual a cidade do funcion�rio: ");
        String cidade = entrada.nextLine();
        
        System.out.print("Qual UF do funcion�rio: ");
        String estado = entrada.nextLine();
        
        System.out.print("Quantidade de horas trabalhadas: ");
        int horasTrabalhadas = entrada.nextInt();
        entrada.nextLine();
        
        System.out.print("Qual o valor recebido por hora: ");
        double vlrHora = entrada.nextDouble();
        entrada.nextLine();

        funcionario funcionario = new funcionario(
                nome,sobrenome,cidade,estado,horasTrabalhadas,vlrHora
        );

        boolean continuar = true;
        do{
            System.out.println("\n=== Menu ===" +
                    "\n1 - Incrementar a quantidade de horas trabalhadas? " +
                    "\n2 - Substituir o valor por hora do funcion�rio? " +
                    "\n3 - Calcular o sal�rio do funcion�rio no final do m�s? ");
            
            int op = entrada.nextInt();
            entrada.nextLine();

            switch (op) {
                case 1:
                    System.out.println();
                    funcionario.printNomeSobrenome();
                    System.out.print("Informe a quantidade de horas a serem incrementadas: ");
                    int horas = entrada.nextInt();
                    entrada.nextLine();
                    funcionario.incrementaHora(horas);
                    break;
                case 2:
                    System.out.println();
                    funcionario.printNomeSobrenome();
                    System.out.println("Qual � o novo valor por hora:");                    
                    funcionario.vlrHora = entrada.nextDouble();
                    entrada.nextLine();
                    System.out.println("Novo valor por hora: R$" + funcionario.vlrHora);
                    break;
                case 3:
                    System.out.println();
                    funcionario.calcSalario();
                    break;
                default:
                    System.out.println("\nOp��o "+op+" inv�lida!\n");
            }

            System.out.println("\nDeseja voltar ao menu? 'S' ou 'N':");
            String resposta = entrada.next();
            if (!resposta.equalsIgnoreCase("S")) {
            	continuar = false;
            }
        } while (continuar);
    }
}