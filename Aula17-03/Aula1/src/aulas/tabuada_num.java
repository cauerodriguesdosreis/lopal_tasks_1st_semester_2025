package aulas;

import java.util.Scanner;

public class tabuada_num {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int num;

		System.out.println("Olá!");
		System.out.println("Digite um número: ");
		num = sc.nextInt();

		int i = 1;

		do {
			System.out.println(num + "x" + i + " = " + (num * i));
			i++;
		} while (i <= 10);

		sc.close();

	}

}
