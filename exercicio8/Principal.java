package exercicio8;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    System.out.print("Digite um número inteiro para calcular o fatorial: ");
	    int numero = sc.nextInt();
	    
	    Exercicio8 exercicio = new Exercicio8();
	    int resultado = exercicio.calcularFatorial(numero);
	    
	    System.out.println(numero + "! = " + resultado);

	}


}