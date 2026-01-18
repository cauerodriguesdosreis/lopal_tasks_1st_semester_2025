package aulas;

import java.util.Scanner;

public class num_par_impar {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num;

		System.out.println("Olá!");
		System.out.print("Digite um número: ");
		num = sc.nextInt();

		if (num == 0) {
			System.out.println("Este número não se aplica a números pares ou ímpares.");

			return;
		}

		while (true) {
			if (num % 2 == 0) {
				System.out.println("Este número é par.");
			} else {
				System.out.println("Este número é ímpar.");
			}
			break;
		}
		sc.close();
	}
}
