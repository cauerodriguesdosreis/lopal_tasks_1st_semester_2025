package aula26052025;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex7IlhaDosCódigosPerdidos {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		List<String> codigos = new ArrayList<>();
		
		System.out.println("Olá!");
		System.out.println("Para avançar para o próximo passo, digite quais códigos você encontrou até agora!");
		System.out.println("(nós só desvendamos códigos que mantém um padrão, como '4A' || '3C' || '7B')");
		System.out.println("(Digite 'fim' quando não houver mais códigos)");
		
		//Inserção de dados nas variáveis determinadas
		while (true) {
		
			System.out.print("Código: ");
			String codigo = sc.nextLine().trim().toUpperCase();
			
			if (codigo.equals("FIM")) {
				break;
			}
		
		
		 // Verifica se o formato é válido (opcional)
        if (codigo.matches("\\d+[A-Z]")) {
            codigos.add(codigo);
        } else {
            System.out.println("Formato inválido. Exemplo válido: '4H', '2C', '7A'...");
        }
    }
		
		  // Reconstruindo o código original
        StringBuilder resultado = new StringBuilder();

        for (String codigo : codigos) {
            // Ex: "4H" → número = 4, letra = H
            int quantidade = Integer.parseInt(codigo.substring(0, codigo.length() - 1)); // Essa linha verifica char por char até encontrar número. Quando isso acontece, ele transforma o número que inicialmente estava em uma "String" e o transforma/armazena em "Integer = int".
            char letra = codigo.charAt(codigo.length() - 1); // Essa linha procura a primeira aparição de uma letra. Quando isso acontece, a letra é colocada na variável char.

            
            // Esse loop "for" é para construir a quantidade de vezes que a letra deve ser formatada
            for (int i = 0; i < quantidade; i++) {
                resultado.append(letra);
            }
        }
		
		
        
        if (codigos.isEmpty()) {
        	System.out.println("|");
			System.out.println("Você não tem nenhum código. Volte mais tarde com mais códigos.");
		}
        
        else {
        	System.out.println("|");
        	System.out.println("Aqui está a reestruturação do código! Espero que ajude!");
        	 System.out.println("Código reconstruído:");
             System.out.println(resultado.toString());
		}
  
        sc.close();
		
	}
	


}
