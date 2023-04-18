package exercicio3;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Exercicio3 calc = new Exercicio3();

		int valor;
		char continuar;

		do {
			System.out.print("Digite um valor: ");
			valor = sc.nextInt();

			calc.adicionarValor(valor);

			System.out.print("Deseja continuar? (s/n): ");
			continuar = sc.next().charAt(0);

		} while (continuar == 's' || continuar == 'S');

		System.out.println("Média Aritmética: " + calc.calcularMedia());
		System.out.println("Quantidade de valores positivos: " + calc.getQuantidadePositivos());
		System.out.println("Quantidade de valores negativos: " + calc.getQuantidadeNegativos());
		System.out.println("Percentual de valores positivos: " + calc.getPercentualPositivos() + "%");
		System.out.println("Percentual de valores negativos: " + calc.getPercentualNegativos() + "%");

		sc.close();
	}

}
