package classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Loja {

	public static void main(String[] args) {

		Loja loja = new Loja();
		loja.exibirMenu();

	}

	private List<Produto> produtos = new ArrayList<>();
	private boolean comprando;
	private Scanner sc = new Scanner(System.in);
	private double saldo = 30;
	private String nome = "Victor";
	private char comprarNovamente;
	private boolean comprandoMais;
	private Produto produto;

	public Loja() {

		produtos.add(new Produto(1, "Arroz", 6.00, 4));
		produtos.add(new Produto(2, "Feijão", 5.00, 7));
		produtos.add(new Produto(3, "Lasanha", 12.00, 4));
		System.out.println("Olá! Bem-vindo à loja, " + nome + "!");
		System.out.printf("Saldo disponível: R$ %.2f", saldo);

	}

	public boolean venderQtd() {
		if (produto.getQtdEstoque() > 0) {
			produto.getQtdEstoque() -= qtd;
			return true;
		} else {
			return false;
		}
	}

	private void exibirMenu() {
		comprando = true;
		System.out.println("\n--- MENU DE PRODUTOS ---");
		while (comprando) {

			for (int i = 0; i < produtos.size(); i++) {
				Produto p = produtos.get(i);

				System.out.printf("%d) %s - R$ %.2f (%d disponíveis) \n", (i + 1), p.getNome(), p.getPreco(),
						p.getQtdEstoque());

			}
			System.out.print("Escolha sua opção: ");
			int opcao = sc.nextInt();
			sc.nextLine();

			if (opcao >= 1 && opcao <= produtos.size()) {
				realizarCompra(produtos.get(opcao - 1));
				comprando = false;
			}

			else if (opcao > produtos.size()) {
				System.out.println("Opção inválida! Tente novamente.");
			}

		}
	}

	private void realizarCompra(Produto produto) {

		System.out.printf("Você selecionou: %s", produto.getNome());

		if (saldo > produto.getPreco()) {
			System.out.print("\nDigite a quantidade que deseja: ");
			int qtd = sc.nextInt();

			if (qtd <= produto.getQtdEstoque()) {
				saldo -= (produto.getPreco() * qtd);

				System.out.println("Compra realizada!");
				System.out.printf("Saldo restante: R$ %.2f", saldo);
				comprarMais();
			}
		}

		else {
			System.out.println("Não possuímos essa quantidade em estoque.");
		}
	}

	private void comprarMais() {
		comprandoMais = true;
		while (comprandoMais) {
			System.out.println("\nVocê deseja comprar mais? (s/n)");
			comprarNovamente = sc.next().toLowerCase().charAt(0);
			if (comprarNovamente == 's') {
				exibirMenu();
			}

			else if (comprarNovamente == 'n') {
				System.out.println("Obrigado por comprar conosco, " + nome + "!");
				comprandoMais = false;
			}

			else {
				System.out.println("Digite 's' ou 'n'");
			}
		}

	}
}
