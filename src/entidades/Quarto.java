package entidades;

public class Quarto {
	
	private String nomeHospede;
	private String emailHospede;
	private int numero;
	
	public Quarto(String nomeHospede, String emailHospede, int numero) {
		this.nomeHospede = nomeHospede;
		this.emailHospede = emailHospede;
		this.numero = numero;
	}

	public String getNomeHospede() {
		return nomeHospede;
	}

	public void setNomeHospede(String nomeHospede) {
		this.nomeHospede = nomeHospede;
	}

	public String getEmailHospede() {
		return emailHospede;
	}

	public void setEmailHospede(String emailHospede) {
		this.emailHospede = emailHospede;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public String toString() {
		return "Quarto " + numero
			   + ", " + nomeHospede
			   + ", " + emailHospede;
	}
	
	
	
}
