package descontos;

import java.util.Scanner;

public class DescontosSalárioBruto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double inssdesc = 0, irdesc = 0, descVt = 0, descVa = 0, descVr = 0, descPlanoSaude = 0;

		System.out.println("Olá! Seja bem-vindo ao sistema de visualização de bolsa-auxílio da sua empresa!");

		System.out.print("Por favor, nos informe seu salário: ");
		double salarioBruto = sc.nextDouble();

		if (salarioBruto <= 1302.00) {
			inssdesc = (salarioBruto * 0.08);
			System.out.printf("O desconto de INSS é de: R$ %.2f", inssdesc);
			System.out.println();
			System.out.println("|");
		} else if (salarioBruto <= 2571.00) {
			inssdesc = (salarioBruto * 0.09);
			System.out.printf("O desconto de INSS é de: R$ %.2f", inssdesc);
			System.out.println();
			System.out.println("|");
		} else if (salarioBruto <= 3856.00) {
			inssdesc = (salarioBruto * 0.11);
			System.out.printf("O desconto de INSS é de: R$ %.2f", inssdesc);
			System.out.println();
			System.out.println("|");
		} else if (salarioBruto >= 3856.01) {
			inssdesc = (salarioBruto * 0.14);
			System.out.printf("O desconto de INSS é de: R$ %.2f", inssdesc);
			System.out.println();
			System.out.println("|");
		}

		System.out.println("Você possui dependentes? (s/n)");
		char dependentes = sc.next().toLowerCase().charAt(0);

		if (dependentes == 's') {
			System.out.println("Quantos dependentes são? ");
			int numDependentes = sc.nextInt();

			if (salarioBruto <= 1903.98) {
				irdesc = (numDependentes * 189.59);
				System.out.printf("O desconto de Imposto de Renda é de: R$ %.2f", irdesc);
				System.out.println();
				System.out.println("|");
			} else if (salarioBruto <= 2826.65) {
				irdesc = (salarioBruto * 0.075) + (numDependentes * 189.59);
				System.out.printf("O desconto de Imposto de Renda é de: R$ %.2f", irdesc);
				System.out.println();
				System.out.println("|");
			} else if (salarioBruto <= 3751.06) {
				irdesc = (salarioBruto * 0.15) + (numDependentes * 189.59);
				System.out.printf("O desconto de Imposto de Renda é de: R$ %.2f", irdesc);
				System.out.println();
				System.out.println("|");
			} else if (salarioBruto <= 4664.67) {
				irdesc = (salarioBruto * 0.225) + (numDependentes * 189.59);
				System.out.printf("O desconto de Imposto de Renda é de: R$ %.2f", irdesc);
				System.out.println();
				System.out.println("|");
			} else {
				irdesc = (salarioBruto * 0.275) + (numDependentes * 189.59);
				System.out.printf("O desconto de Imposto de Renda é de: R$ %.2f", irdesc);
				System.out.println();
				System.out.println("|");
			}
		}

		if (dependentes == 'n') {

			if (salarioBruto <= 1903.98) {
				irdesc = 0;
				System.out.println("Você está isento ao Imposto de Renda.");
				System.out.println("|");
			} else if (salarioBruto <= 2826.65) {
				irdesc = (salarioBruto * 0.075);
				System.out.printf("O desconto de Imposto de Renda é de: R$ %.2f", irdesc);
				System.out.println();
				System.out.println("|");
			} else if (salarioBruto <= 3751.05) {
				irdesc = (salarioBruto * 0.15);
				System.out.printf("O desconto de Imposto de Renda é de: R$ %.2f", irdesc);
				System.out.println();
				System.out.println("|");
			} else if (salarioBruto <= 4664.08) {
				irdesc = (salarioBruto * 0.225);
				System.out.printf("O desconto de Imposto de Renda é de: R$ %.2f", irdesc);
				System.out.println();
				System.out.println("|");
			} else if (salarioBruto > 4664.08) {
				irdesc = (salarioBruto * 0.275);
				System.out.printf("O desconto de Imposto de Renda é de: R$ %.2f", irdesc);
				System.out.println();
				System.out.println("|");
			}
		}

			// Vale-transporte
			System.out.println("Você utiliza Vale-Transporte? (s/n)");
			char vt = sc.next().toLowerCase().charAt(0);

			if (vt == 's') {
				descVt = 200;
				System.out.println("O desconto do Vale-Transporte é de: " + descVt);
				System.out.println("|");
			} else if (vt == 'n') {
				descVt = 0;
				System.out.println("Nada será descontado da sua bolsa auxílio referente ao Vale-Trasporte.");
				System.out.println("|");
			}

			// Vale-Alimentação
			System.out.println("Você utiliza Vale-Alimentação? (s/n)");
			char va = sc.next().toLowerCase().charAt(0);

			if (va == 's') {
				descVa = 200;
				System.out.println("O desconto do Vale-alimentação é de: " + descVa);
				System.out.println("|");
			} else if (va == 'n') {
				descVa = 0;
				System.out.println("Nada será descontado da sua bolsa auxílio referente ao Vale-Alimentação.");
				System.out.println("|");
			}

			// Vale-Refeição
			System.out.println("Você utiliza Vale-Refeição? (s/n)");
			char vr = sc.next().toLowerCase().charAt(0);

			if (vr == 's') {
				descVr = 250;
				System.out.println("O desconto do Vale-alimentação é de: " + descVr);
				System.out.println("|");
			} else if (vr == 'n') {
				descVr = 0;
				System.out.println("Nada será descontado da sua bolsa auxílio referente ao Vale-Alimentação.");
				System.out.println("|");
			}

			// Plano de Saúde
			System.out.println("Qual é seu plano de saúde? (Básico ou avançado)");
			char planosaude = sc.next().toLowerCase().charAt(0);

			if (planosaude == 'b') {
				descPlanoSaude = 150;
				System.out.println("O desconto do seu plano de saúde é de: " + descPlanoSaude);
				System.out.println("|");
			} else if (planosaude == 'a') {
				descPlanoSaude = 300;
				System.out.println("O desconto do seu plano de saúde é de: " + descPlanoSaude);
				System.out.println("|");
			}

			double totalDescontos = inssdesc + irdesc + descVt + descVa + descVr + descPlanoSaude;
			double salarioLiquido = salarioBruto - totalDescontos;
			double somaDescontos = (totalDescontos / salarioBruto) * 100;
			System.out.printf("O seu salário líquido é de: R$ %.2f.%n", salarioLiquido);
			System.out.printf("O percentual da soma de todos os descontos em relação ao salário bruto é de: %.2f%%",
					somaDescontos);

		sc.close();
	}

}
