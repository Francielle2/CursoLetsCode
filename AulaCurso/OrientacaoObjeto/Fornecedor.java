package OrientacaoObjeto;

public class Fornecedor extends Pessoa {
	    private String nome;
	    private double valorCredito;
	    private double valorDivida;
	    private double obterSaldo;
	    
	    public String getNome() {
	        return this.nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }
	    
	    public double getValorCredito() {
	        return valorCredito;
	    }
	    public void setValorCredito(double valorCredito) {
	        this.valorCredito = valorCredito;
	    }
	    
	    public double getValorDivida() {
	        return valorDivida;
	    }
	    public void setValorDivida(double valorDivida) {
	        this.valorDivida = valorDivida;
	    }

	    public double obterSaldo() {
			return (getValorCredito() - getValorDivida());
	    }
}