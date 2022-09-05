package entidades;

public class Produto02 {

	public String nome;
	public double preco;
	public int qtd;
	
	// Construtor Padrão Java sem especificação de parâmetros
	public Produto02() {
	}
	
	// Definindo um Construtor Java especificando parâmetros.
	public Produto02 (String nome, double preco, int qtd) {
		this.nome = nome;
		this.preco = preco;
		this.qtd = qtd;
	}
	
	// Neste exemplo de construtor, como não foi passado o parâmetro de quantidade,
	// a mesma vai ser inicializada com o valor zerado.
	public Produto02 (String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
	}

	// Defininfo Getters e Setters para manipulação de valores dos atributos.
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	//   Atributo  = parâmetro de entrada;
	}
	
	public int getQtd() {
		return qtd;
	}
	
	public double valorTotalEmEstoque() {
		return preco * qtd;
	}
	
	public void adicionarProduto(int qtd) {
		this.qtd += qtd;
	}
	
	public void removerProduto(int qtd) {
		this.qtd -= qtd;
	}
	
	public String toString() {
		return "Dados do Produto: " 
				+ nome 
				+ ", R$ " 
				+ String.format("%.2f", preco) 
				+ ", " 
				+ qtd 
				+ " unidades, Total: R$ " 
				+ String.format("%.2f", valorTotalEmEstoque());
	}
}
