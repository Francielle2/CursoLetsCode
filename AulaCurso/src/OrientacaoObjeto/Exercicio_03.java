package OrientacaoObjeto;

import java.util.Scanner;

public class Exercicio_03 {
/*Considere, como subclasse da classe Pessoa, a classe Empregado. Considere que cada inst�ncia da classe
Empregado tem, para al�m dos atributos que caracterizam a classe Pessoa, os atributos:
    codigoSetor (inteiro),
    salarioBase (vencimento base)
    imposto (porcentagem retida dos impostos).
Implemente a classe Empregado com m�todos seletores e modificadores e um m�todo calcularSalario.
Escreva um programa de teste adequado para a classe Empregado. */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantidade de empregados que v�o ser cadastrados?");
        Empregado[] empregado = new Empregado[scanner.nextInt()];
        scanner.nextLine();

        for (int i = 0; i < empregado.length; i++){
            empregado[i] = new Empregado();
            System.out.println("\nDigite os dados do "+(i+1)+"� empregado:");
            System.out.println("Nome:");
            empregado[i].setNome(scanner.nextLine());
            System.out.println("Endere�o:");
            empregado[i].setEndereco(scanner.nextLine());
            System.out.println("Telefone:");
            empregado[i].setTelefone(scanner.nextLine());
            System.out.println("Codigo de Setor:");
            empregado[i].setCodigoSetor(scanner.nextInt());
            scanner.nextLine();
            System.out.println("Sal�rio Base (R$):");
            empregado[i].setSalarioBase(scanner.nextDouble());
            scanner.nextLine();
            System.out.println("Imposto sobre salario (%): Ex: '10'");
            empregado[i].setImposto(scanner.nextFloat());
            scanner.nextLine();
            System.out.println("Total de dias trabalhados: ('30' para todos)");
            int diasTrab = (scanner.nextInt());
            scanner.nextLine();
            System.out.println("Total de descontos (R$):");
            double descontos = (scanner.nextDouble());
            scanner.nextLine();

            System.out.printf("Salario Final do funcionario %s: \nR$ %.2f%n",
                    empregado[i].getNome(),
                    empregado[i].calcularSalario(diasTrab,descontos));
        }
    }
}