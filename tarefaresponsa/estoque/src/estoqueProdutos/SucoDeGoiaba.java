package estoqueProdutos;

public class SucoDeGoiaba extends Produto {
	private double valor = 12;

	public SucoDeGoiaba(double saldo, String nome_produto, double preco, int qtd) {
		super(saldo, nome_produto, preco, qtd);
		this.valor = valor;
	}
	
	public double getValor () {
		return valor;
	}
	
	public void setValor (double valor) {
		this.valor = valor;
	}
	
	public void CompraCliente () {
		if (saldo>valor) {
			if (saldo>=preco) {
				double subt_saldo = saldo - preco;
				System.out.println("Compra efetuada! Seu saldo agora é de: " + subt_saldo);
				System.out.println("Quantidade de produtos restantes de " + nome_produto + ": " + (qtd-1));
			}
		}
	}

}
