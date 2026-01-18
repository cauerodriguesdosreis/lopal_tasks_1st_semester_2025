package primeiraAula;

import java.util.Scanner;

public class PrimeiraAula {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		double largura, comprimento, m2, área, total;
		//Perguntar no console a largura do cômodo
		System.out.print("Digite a largura do cômodo: ");
		largura = sc.nextDouble();
		
		//Perguntar no console o comprimento do cômodo
		System.out.print("Digite o comprimento do cômodo: ");
		comprimento = sc.nextDouble();
		
		//Perguntar o valor do metro quadrado do piso
		System.out.print("Digite o valor do metro quadrado do piso: ");
		m2 = sc.nextDouble();
		
		área = largura * comprimento;
		//Entregar o valor da área do cômodo de acordo com a conta realizada acima
		System.out.println("Área do cômodo: "+ área);
		total = área * m2;
		//Entregar o custo total do piso de acordo com a conta realizada acima
		System.out.print("Custo total do piso: ");
		System.out.println(String.format("%.3f", total));
		
		área = sc.nextDouble();
		m2 = sc.nextDouble();
        sc.close();
        }

}
