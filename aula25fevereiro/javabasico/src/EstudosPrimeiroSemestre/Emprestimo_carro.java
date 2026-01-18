package EstudosPrimeiroSemestre;

import java.util.Scanner;

public class Emprestimo_carro {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
				
	    float salario;
	    int idade;
	    
	    System.out.println("Olá! Bem-vindo à concessionária!");
	    System.out.print("Informe seu salário: ");
		salario = sc.nextFloat();
		
		System.out.print("Agora, informe a sua idade: ");
		idade = sc.nextInt();
		
		if (idade>=18 && salario>=1000) {
			System.out.println("Você é compatível para a compra do carro!");
		} else {
			System.out.println("Você não é compatível para a compra do carro.");
		} if (idade<18) {
			System.out.println("Motivo: idade inferior à 18 anos.");
		} if (salario<1000) {
			System.out.println("Motivo: Salário inferior à R$ 1.000,00.");
		}
	
		sc.close();

	}

}
