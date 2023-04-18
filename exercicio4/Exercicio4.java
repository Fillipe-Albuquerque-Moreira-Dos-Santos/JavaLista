package exercicio4;

import java.util.Scanner;

public class Exercicio4 {
	
	private int intervalo1 = 0;
    private int intervalo2 = 0;
    private int intervalo3 = 0;
    private int intervalo4 = 0;

    public void contarNumeros() {
        try (Scanner sc = new Scanner(System.in)) {
			int num;

			do {
				System.out.println("DIGITE UM NÚMERO NEGATIVO PARA SAIR DO PROGRAMA");
				System.out.println("-----------------------------------------------");
			    System.out.print("Digite um número");
			    num = sc.nextInt();

			    if (num >= 0 && num <= 25) {
			        intervalo1++;
			    } else if (num >= 26 && num <= 50) {
			        intervalo2++;
			    } else if (num >= 51 && num <= 75) {
			        intervalo3++;
			    } else if (num >= 76 && num <= 100) {
			        intervalo4++;
			    }

			} while (num >= 0);
			
		}
    }

    public void imprimirResultados() {
    	System.out.println("Intervalo [0-25]: " + intervalo1);
        System.out.println("Intervalo [26-50]: " +  intervalo2);
        System.out.println("Intervalo [51-75]: " +  intervalo3);
        System.out.println("Intervalo [76-100]: "+ intervalo4);
        
      
    }
    
    

}
