package entidades;

public class Funcionario {

	public String nome;
	public double salarioBruto;
	public double descontos;
	
	public double salarioLiquido() {
		return this.salarioBruto - this.descontos;
	}
	
	public void aplicarAumento(double percentual) {
		this.salarioBruto = salarioBruto*(1 + percentual/100);
	}
	
	public String toString() {
		return "Dados do Funcionário \nNome: "
		+ nome 
		+ "\nSalário Bruto: R$ "
		+ String.format("%.2f", salarioBruto)
		+ "\nSalário Líquido: R$ "
		+ String.format("%.2f", salarioLiquido());
	}
}
