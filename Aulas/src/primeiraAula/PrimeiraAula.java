package primeiraAula;

import java.util.Scanner;

public class PrimeiraAula {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String texto = sc.next();
		
		int numero;
		
		numero = sc.nextInt();

		System.out.println(texto +" "+ numero);
        sc.close();
        }

}
