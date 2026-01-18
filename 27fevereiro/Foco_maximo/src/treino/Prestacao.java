package treino;

import java.util.Scanner;

public class Prestacao {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		double prestacao, valor_bem, taxa_bem;
		int tempo;
		
		System.out.println("Olá!");
		System.out.println("Informe o valor do bem, os juros (%), e o atraso do pagamento (em dias)");
		
		System.out.print("Valor do bem: ");
		valor_bem = sc.nextDouble();
		
		System.out.print("Juros: ");
		taxa_bem = sc.nextDouble();
		
		System.out.print("Tempo em atraso: ");
		tempo = sc.nextInt();

		prestacao = valor_bem + (valor_bem * (taxa_bem / 100) * tempo);
		
		System.out.println("O valor da sua prestação considerando o atraso é de R$ " + prestacao);
		
		sc.close();

	}

}
