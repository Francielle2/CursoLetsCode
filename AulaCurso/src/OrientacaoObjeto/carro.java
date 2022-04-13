package OrientacaoObjeto;

public class carro {

	String placa;
	String cor;
	String modelo;
	int qtdPorta;
	boolean totalFlex; //sim ou nao
	String categoria;
	double velocidade;
	double velocidadeMaxima;
	
	carro(String placa){
		System.out.println("Estou chamando o construtor de placa");
	}
	
	carro(String placa, String cor){
		System.out.println("Estou chamando o construtor de placa e cor");
	}
	
	carro(){
		System.out.println("Construtor vazio");
	}
	
	void acelerar(double valor) {
		if((this.velocidade + valor) < velocidadeMaxima);
			System.out.println("Estou acelerando...");
			this.velocidade += valor;
			System.out.println("Velocidade atual: " +this.velocidade);
	}


}
