package OrientacaoObjeto;

import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {
 /*Considere, como subclasse da classe Pessoa (desenvolvida no exercício anterior) a classe Fornecedor. Considere que 
cada instância da classe Fornecedor tem, para além dos atributos que caracterizam a classe Pessoa, os atributos:
    valorCredito (correspondente ao crédito máximo atribuído ao fornecedor).
    valorDivida (montante da dívida para com o fornecedor).
Implemente na classe Fornecedor, para além dos usuais métodos seletores e modificadores.
Um método obterSaldo() que devolve a diferença entre os valores dos atributos valorCredito e valorDivida.
Depois de implementada a classe Fornecedor, crie um programa de teste adequado que lhe permita verificar o
funcionamento dos métodos implementados na classe Fornecedor e os herdados da classe Pessoa.
*/

        Scanner scanner = new Scanner(System.in);
        Fornecedor fornecedor = new Fornecedor();

        System.out.println("Nome Fornecedor: ");
        fornecedor.setNome(scanner.nextLine());
        System.out.println("Valor do crédito: ");
        fornecedor.setValorCredito(scanner.nextDouble());
        System.out.println("Valor da dívida: ");
        fornecedor.setValorDivida(scanner.nextDouble());

        System.out.println("\nO fornecedor "+ fornecedor.getNome()+ " está com o saldo de " +fornecedor.obterSaldo()+ " reais disponível.");

    }
}