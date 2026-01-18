package produtosEcompra;

public class BoloDeChocolate extends SucoDeCaju {
	private String cobertura;

	public BoloDeChocolate(String nome_cliente, String nome_produto, double saldo_cliente, double preco) {
		super(nome_cliente,  nome_produto, saldo_cliente,  preco);
		this.cobertura = cobertura;
	}
	
	public String getCobertura() {
		return cobertura;
	}
	
	public void setCobertura(String cobertura) {
		this.cobertura = cobertura;
	}
	
	public void ApresentarMain () {
		if (saldo_cliente) {
			
		}
	}
	

}
