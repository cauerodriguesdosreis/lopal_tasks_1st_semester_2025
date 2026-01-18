package aula8;

public class Gerente extends Funcionario {
	
	private int senha;
	private int numeroFuncionariosGerenciados;
	
	public int getSenha() {
		return senha;
	}
	
	public int getNumeroFuncionariosGerenciados() {
		return numeroFuncionariosGerenciados;
	}
	
	public void setNumeroFuncionariosGerenciados(int numeroFuncionarioGerenciados) {
		this.numeroFuncionariosGerenciados = numeroFuncionariosGerenciados;
	}
	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			System.out.println("Acesso permitido!");
			return true;
		} else {
			System.out.println("Acesso negado!");
			return false;
		}
	}
	
	@Override
	public double getBonificacao() {
		return this.
	}
	
}
