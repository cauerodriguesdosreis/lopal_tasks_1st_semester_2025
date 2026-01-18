package foco10042025;

import java.util.Scanner;

public class SomaNumParesForDoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcao;
		int i, soma = 0;
		String pares = " ", impares = "";

		System.out.println("Olá! Bem-vindo à calculadora de números!");
		System.out.println("Escolha uma opção: ");
		System.out.println("1. Soma de números pares");
		System.out.println("2. Soma de números ímpares");
		System.out.println("3.Sair...");
		System.out.print("Opção: ");
		opcao = sc.nextInt();

		switch (opcao) {
		case 1: {
			System.out.print("Digite um número: ");
			int npar = sc.nextInt();

			for (i = 1; i <= npar; i++) {

				if (i % 2 == 0) {
					soma += i;
					pares += i + " ";
				}
			}

			if (!pares.isEmpty()) {
				System.out.println("Os números pares de 1 a " + npar + " são: " + pares);
				System.out.printf("A soma dos números pares entre 1 a %d é: %d", npar, soma);
			} else {
				System.out.println("Nenhum número par foi encontrado.");
			}
			break;
		}
		case 2: {
			System.out.println("Digite um número: ");
			int nimp = sc.nextInt();
			for (int j = 1; j <= nimp; j++) {
				if (j % 2 != 0) {
					soma += j;
					impares += j + " ";
				}
			}
			if (!impares.isEmpty()) {
				System.out.println("Os números ímpares entre 1 a " + nimp + " são: " + impares);
				System.out.printf("A soma dos números ímpares entre 1 a %d é: %d", nimp, soma);
			} else {
				System.out.println("Nenhum número ímpar foi encontrado.");
			}

			break;
		}

		case 3: {
			System.out.println("Saindo...");

			break;
		}
		default:
			System.out.println("Opção inválida. Tente novamente.");
			break;
		}

		sc.close();

	}
}
