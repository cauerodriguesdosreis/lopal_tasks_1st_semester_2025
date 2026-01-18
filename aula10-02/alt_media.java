package primeiraAula;

import java.util.Scanner;

public class alt_media {

	public static void main(String[] args) {
    
	Scanner sc = new Scanner (System.in);
		    
    double alt1, alt2, media;
    String nome1, nome2;
    
    System.out.println("Dados da primeira pessoa: ");
    
    System.out.print("Nome: "); 
    nome1 = sc.nextLine();
    
    System.out.print("Altura: "); 
    alt1 = sc.nextDouble();
    
    System.out.println("Dados da segunda pessoa: ");
    
    System.out.print("Nome: ");
    String c = sc.nextLine();
    nome2 = sc.nextLine();
    
    System.out.print("Altura: ");
    alt2 = sc.nextDouble();
    sc.close();

    media = alt1 / alt2;
    System.out.print("A altura média de " + nome1+ " e " +nome2+ " é igual a: " + String.format("%.2f", media) + " metros");
	}

}
