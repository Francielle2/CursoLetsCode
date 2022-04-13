package OrientacaoObjeto;

public class Main {
	public static void main(String[] args) {

		Pessoa pessoaFrancielle = new Pessoa("Francielle", "Rua Fulano de Tal, 18 - Fulano", "(31) 3434-5656");
		
//		pessoaFrancielle.nome = "Francielle";
//		pessoaFrancielle.CPF = "111.222.333-44";
//		pessoaFrancielle.idade = 30;
//		pessoaFrancielle.corCabelo = "Castanho Escuro";
//		pessoaFrancielle.corPele = "Negra";		
//		System.out.println("Nome da pessoa: " +pessoaFrancielle.nome);
		
		System.out.println("Retornando pessoa: " + pessoaFrancielle.toString());
		
		Conta contaFrancielle = new Conta("001", 200, "Francielle", 500);
//		contaFrancielle.titular = "Francielle";
//		contaFrancielle.limite = 50000;
//		contaFrancielle.saldo = 2000;
//		contaFrancielle.conta = "00002";
		
		System.out.println("Retornando conta: " + contaFrancielle.toString());
        System.out.println("Retornando conta 2: " + contaFrancielle);

//      System.out.println("Saldo antes do saque: " + contaFrancielle.saldo);
//      System.out.println("Saque efetuado com sucesso? " + contaFrancielle.saca(600));
//      System.out.println("Saldo após o saque: " + contaFrancielle.saldo);
		
        Conta contaFran = new Conta();
        contaFran.setTitular("Fran");
        contaFran.setLimite(10000);
        contaFran.setNumero("00004");
        
        System.out.println("Saldo do Francielle antes da transferencia: " + contaFrancielle.getSaldo());
        System.out.println("Saldo do Fran antes da transferencia: " + contaFran.getSaldo());
        contaFran.transfere(contaFrancielle, 12000);
        System.out.println("Saldo do Francielle depois da transferencia: " + contaFrancielle.getSaldo());
        System.out.println("Saldo do Fran depois da transferencia: " + contaFran.getSaldo());
	}

}
