package primeiraAula;

import java.util.Scanner;

public class Soma {

	public static void main(String[] args) {
		
		int numero1, numero2, soma;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		numero1 = sc.nextInt();
		System.out.print("Digite o segundo valor: ");
		numero2 = sc.nextInt();
		soma = numero1 + numero2;
		
		System.out.print("Resultado: " + soma);
        sc.close();
	}

}