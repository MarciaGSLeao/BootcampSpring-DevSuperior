package entidades;

public class ContaBancaria {
	
	private int conta;
	private String titular;
	private double saldo;
	
	public ContaBancaria(int conta, String titular, double depositoInicial) {
		this.conta = conta;
		this.titular = titular;
		this.saldo = depositoInicial;
	}
	
	public ContaBancaria(int conta, String titular) {
		this.conta = conta;
		this.titular = titular;
	}
	
	public ContaBancaria() {
	}
	
	public void setConta(int conta) {
		this.conta = conta;
	}
	
	public int getConta() {
		return conta;
	}
	
	public void setTitular(String nome) {
		 this.titular = nome;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void Depositar(double valorDeposito) {
		saldo += valorDeposito;
	}

	public void Sacar(double valorSacado) {
		saldo -= valorSacado + 5.00; // 5.00 é a taxa cobrada por cada saque efetuado.
	}
	
	public String toString(){
		return "****************\n"
			   +"Dados da conta\n"
			   + "****************\n"
			   + "\nNúmero da conta: " + conta
			   + "\nTitular da conta: " + titular
			   + "\nSaldo: " + saldo;
	}
	
}
