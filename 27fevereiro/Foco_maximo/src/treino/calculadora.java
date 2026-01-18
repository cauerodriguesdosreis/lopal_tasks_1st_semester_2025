package treino;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double n1, n2, resultado;
		int operacao;

		System.out.println("Olá!");
		System.out.println("Escolha qual operação você gostaria utilizar: ");
		System.out.println("1.  Soma");
		System.out.println("2.  Subtração");
		System.out.println("3.  Multiplicação");
		System.out.println("4.  Divisão");
		System.out.print("Digite o número da operação: ");
		operacao = sc.nextInt();
		
		if (operacao == 1) {
			System.out.print("Digite o primeiro número: ");
			n1 = sc.nextDouble();
			System.out.print("Digite o segundo número: ");
			n2 = sc.nextDouble();

	        resultado = n1 + n2;
			System.out.println("O resultado da operação é: " + resultado);
		    } 
		
		else if (operacao==2) {
		    	System.out.print("Digite o primeiro número: ");
				n1 = sc.nextDouble();
				System.out.print("Digite o segundo número: ");
				n2 = sc.nextDouble();
		    resultado = n1 - n2;
			System.out.println("O resultado da operação é: " + resultado);
			} 
		else if (operacao==3) {
		    	System.out.print("Digite o primeiro número: ");
				n1 = sc.nextDouble();
				System.out.print("Digite o segundo número: ");
				n2 = sc.nextDouble();
		       
				resultado = n1 * n2;
		       System.out.println("O resultado da operação é: " + resultado);
		}

		else if (operacao==4) {
	    	System.out.print("Digite o primeiro número: ");
			n1 = sc.nextDouble();
			System.out.print("Digite o segundo número: ");
			n2 = sc.nextDouble();
	       
			if (n2 != 0) {
			resultado = n1 / n2;
	       System.out.println("O resultado da operação é: " + resultado);
	       
			} else {
				System.out.println("Não é possível efetuar este cálculo.");
			}
	}  
		if (operacao>4 || operacao<0) {
			System.out.println("Operação inexistente.");
		}
		
		sc.close();

	}

}
