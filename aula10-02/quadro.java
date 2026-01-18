package primeiraAula;

import java.util.Scanner;

public class quadro {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	
	double larg_quad, alt_quad, área, perímetro, diagonal;
	System.out.print("Largura do quadro: ");
	larg_quad = sc.nextDouble();
	
	System.out.print("Altura do quadro: ");
	alt_quad = sc.nextDouble();
	
	área = larg_quad * alt_quad;
	System.out.println("Área: "+ String.format("%.4f", área));
	
	perímetro = (larg_quad * 2) + (alt_quad * 2);
	System.out.println("Perímetro: "+ String.format("%.4f", perímetro));
	
	diagonal = Math.sqrt((larg_quad * larg_quad) + (alt_quad * alt_quad));
	System.out.println("Diagonal: "+ String.format("%.4f", diagonal));
	sc.close();

	}

}
