package treino;

import java.util.Scanner;

public class calc_de_desconto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
	    float valor, porcentagem, result;
	    
	    System.out.println("Olá!");
	    System.out.print("Digite o valor da compra: ");
		valor = sc.nextFloat();
		
		if (valor<=0) {
			System.out.println("É impossível realizar este cálculo. ");
			System.exit(0);
		}
		
		if (valor<100) {
			
			porcentagem = (float) (valor * 0.05);
			result = valor - porcentagem;
		
					
			System.out.println("O desconto da sua compra é de: R$ " + String.format("%.2f", porcentagem) + " reais. (5%)");
			System.out.println("Sendo assim, o valor final a pagar é de: R$ " + String.format("%.2f", result) + " reais.");
			
			
		} else if (valor>100 && valor <=500) {
			
			porcentagem = (float) (valor * 0.10);
			result = valor - porcentagem;
					
			System.out.println("O desconto da sua compra é de: R$ " + String.format("%.2f", porcentagem) + " reais. (10%)");
			System.out.println("Sendo assim, o valor final a pagar é de: R$ " + String.format("%.2f", result) + " reais.");
			

		} else if (valor>500) {
			
			porcentagem = (float) (valor * 0.15);
			result = valor - porcentagem;
					
			System.out.println("O desconto da sua compra é de: R$ " + String.format("%.2f", porcentagem) + " reais. (15%)");
			System.out.println("Sendo assim, o valor final a pagar é de: R$ " + String.format("%.2f", result) + " reais.");
		} 
		
		sc.close();
	}

}
