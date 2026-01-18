package classes;

public class Produto {
	
	private int codigo;
	private String nome;
	private double preco;
	private int qtdEstoque;

	
	public Produto(int codigo, String nome, double preco, int qtdEstoque) {
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
		this.qtdEstoque = qtdEstoque;
	}
	
	public int getCodigo() {
		return codigo;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getPreco () {
		return preco;
	}
	
	public int getQtdEstoque () {
		return qtdEstoque;
	}
}
