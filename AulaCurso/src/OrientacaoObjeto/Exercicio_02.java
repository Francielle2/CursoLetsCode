package OrientacaoObjeto;

import java.util.Scanner;

public class Exercicio_02 {

	public static void main(String[] args) {
 /*Considere, como subclasse da classe Pessoa (desenvolvida no exerc?cio anterior) a classe Fornecedor. Considere que 
cada inst?ncia da classe Fornecedor tem, para al?m dos atributos que caracterizam a classe Pessoa, os atributos:
    valorCredito (correspondente ao cr?dito m?ximo atribu?do ao fornecedor).
    valorDivida (montante da d?vida para com o fornecedor).
Implemente na classe Fornecedor, para al?m dos usuais m?todos seletores e modificadores.
Um m?todo obterSaldo() que devolve a diferen?a entre os valores dos atributos valorCredito e valorDivida.
Depois de implementada a classe Fornecedor, crie um programa de teste adequado que lhe permita verificar o
funcionamento dos m?todos implementados na classe Fornecedor e os herdados da classe Pessoa.
*/

        Scanner scanner = new Scanner(System.in);
        Fornecedor fornecedor = new Fornecedor();

        System.out.println("Nome Fornecedor: ");
        fornecedor.setNome(scanner.nextLine());
        System.out.println("Valor do cr?dito: ");
        fornecedor.setValorCredito(scanner.nextDouble());
        System.out.println("Valor da d?vida: ");
        fornecedor.setValorDivida(scanner.nextDouble());

        System.out.println("\nO fornecedor "+ fornecedor.getNome()+ " est? com o saldo de " +fornecedor.obterSaldo()+ " reais dispon?vel.");

    }
}