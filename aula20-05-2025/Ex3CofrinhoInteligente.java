package ExerciciosFoco;

import java.util.Scanner;

public class Ex3CofrinhoInteligente {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double[] moedas = {0.01, 0.05, 0.10, 0.25, 0.50, 1.00};
		double[] quantidades = new double [moedas.length];
		
		double total = 0;
		
		System.out.println("Olá!");
		System.out.println("Digite a quantidade de moedas de cada valor que você tem: ");
		
		for (int i = 0; i < quantidades.length; i++) {
			System.out.print("Moeda de R$ " + String.format("%.2f", moedas[i]) + ": ");
			quantidades[i] = sc.nextInt();
			total += quantidades[i] * moedas[i];
		}
		
		double metaSaldo = 100;
		double faltando = metaSaldo - total;
		System.out.printf("A quantidade total de moedas no seu cofre é de: R$ %.2f", total);
		
		if (total >= metaSaldo) {
			System.out.printf("\nParabéns! Você ultrapassou a meta de R$ %.2f!", metaSaldo);
		}
		
		else {
			System.out.printf("\nFaltam R$ %.2f reais para bater a meta!", faltando);
		}
		
		int semanas = (int) Math.ceil(faltando / total);
		
		if (total <= metaSaldo) {
			System.out.printf("\nSe você repetir esse mesmo depósito a cada semana, em %d semanas terá batido a meta!", semanas);
		}
		
		sc.close();
	}

}
