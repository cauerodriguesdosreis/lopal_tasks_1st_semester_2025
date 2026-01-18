package estoqueProdutos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	Produto compra = new Produto (80, "Suco de caju", 7, 4);
	
	String produtos[] = {"Suco de caju - 1", "Suco de goiaba - 2", "Bolo de cenoura c/ chocolate - 3", "Coca-cola 2L - 4"};
	int opcao;
	
	System.out.println("Olá! Seja bem-vindo à nossa loja!");
	System.out.println("O que deseja comprar?");
	System.out.println("|");
	for (String nomes : produtos) {
		System.out.println(nomes);
	}
	System.out.print("Digite aqui: ");
	opcao = sc.nextInt();
	
	switch (opcao) {
	case 1: {
		
	
	}
	default:
		
	}
	
	compra.ClienteCompra();

	}

}
