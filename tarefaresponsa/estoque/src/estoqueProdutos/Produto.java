package estoqueProdutos;

public class Produto {
	
	private double saldo;
	private String nome_produto;
	private double preco;
	private int qtd;
	
	public Produto(double saldo, String nome_produto, double preco, int qtd) {
		this.saldo = saldo;
		this.nome_produto = nome_produto;
		this.preco = preco;
		this.qtd = qtd;
	}
	
	public String getNome () {
		return nome_produto;
	}
	
	public void setNome (String nome) {
		this.nome_produto = nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public int getQtd() {
		return qtd;
	}
	
	public void setQtd (int qtd) {
		this.qtd = qtd;
	}
	
	public void ClienteCompra () {
		if (saldo>=preco) {
			double subt_saldo = saldo - preco;
			System.out.println("Compra efetuada! Seu saldo agora é de: " + subt_saldo);
			System.out.println("Quantidade de produtos restantes de " + nome_produto + ": " + (qtd-1));
		}
	}

}
