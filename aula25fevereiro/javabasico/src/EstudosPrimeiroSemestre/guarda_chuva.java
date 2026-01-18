package EstudosPrimeiroSemestre;

import java.util.Scanner;

public class guarda_chuva {

	public static void main(String[] args) {
		//	// Tabela-verdade do operador AND
		System.out.println("Tabela-verdade do operador AND:");
		System.out.println("Chovendo     |  Previsão Chuva  |  Pode atravessar?");
		System.out.println("True         |  True            |   " + (true || true));
		System.out.println("True         |  False           |   " + (true || false));
		System.out.println("False        |  True            |   " + (false||true));
		System.out.println("False        |  False           |   " + (false|| false));
		System.out.println();
		
		// Entrada do usuário
		Scanner sc = new Scanner (System.in);
		System.out.print("Está chovendo agora? (true/false): ");
		boolean chovendo = sc.nextBoolean();
		System.out.print("A previsão indica chuva? (true/false): ");
		boolean previsaoChuva = sc.nextBoolean();
	
		// Processamneto
		
		boolean levarGuardaChuva = chovendo || previsaoChuva; //Condição de atravessar o semáforo
		
		//Saída 
		System.out.println("Devo levar o guarda-chuva? " + levarGuardaChuva);
		
		sc.close();

	}

}
