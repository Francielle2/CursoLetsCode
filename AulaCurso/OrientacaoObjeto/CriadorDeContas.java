package OrientacaoObjeto;

public class CriadorDeContas {
  public static void main(String[] args) {
	  
        Conta contaFrancielle = new Conta();
        contaFrancielle.setNumero("002");

        Conta contaFran = new Conta("0001", 2000, "Fran", 2000);
    }
}