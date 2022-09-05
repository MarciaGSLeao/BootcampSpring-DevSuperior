package entidades;

public class Aluno {
	
	public String nome;
	public double n1;
	public double n2;
	public double n3;
	
	public double totalDePontos() {
		return n1+n2+n3;
	}
	
	public double pontosFaltantes() {
		if (this.totalDePontos() < 60) {
			return 60 - this.totalDePontos();
		}else {
			return 0.0 ;
		}
	}
	
}
