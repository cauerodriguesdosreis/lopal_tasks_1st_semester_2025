package aulas;

import java.util.Scanner;

public class Numeros_vetor_user {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Olá!");
		System.out.print("Me informe quantos números deseja armazenar: ");
		int n = input.nextInt();

		int numeros[] = new int[n];
		
		if (n>5) {
			System.out.println("Não é possível armazenar mais de cinco números diferentes.");
			return;
		}

		for (int i = 0; i < n; i++) {
			System.out.println("Digite um número: ");
			numeros[i] = input.nextInt();
		}

		System.out.print("Números armazenados: ");
		for (int valor : numeros) {
			System.out.print(valor + " ");
		}

		input.close();
	}
}