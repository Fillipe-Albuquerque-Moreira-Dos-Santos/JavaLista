package exercicio5;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Exercicio5 calculadora = new Exercicio5();

		int numero;
		do {
			System.out.println("DIGITE 0 PARA SAIR DO PROGRAMA");
			System.out.println("------------------------------");
			System.out.print("Digite um número");
			numero = sc.nextInt();
			if (numero != 0) {
				calculadora.adicionarNumero(numero);
			}
		} while (numero != 0);

		System.out.println("Quantidade de números pares: " + calculadora.getQuantidadePares());
		System.out.println("Quantidade de números ímpares: " + calculadora.getQuantidadeImpares());
		System.out.println("Média dos valores pares: " + calculadora.getMediaPares());
		System.out.println("Média geral dos números lidos: " + calculadora.getMediaGeral());

		sc.close();
	}

}
