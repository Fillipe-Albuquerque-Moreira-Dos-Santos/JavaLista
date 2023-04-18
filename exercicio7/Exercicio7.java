package exercicio7;

import java.util.Scanner;

public class Exercicio7 {

	public void mostrarTabuada() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um número de 1 a 10 para gerar a tabuada: ");
		int n = sc.nextInt();
		if (n < 1 || n > 10) {
			System.out.println("A opção que você escolheu é inválida");
		} else {
			System.out.println("Tabuada de " + n + ":");
			for (int i = 1; i <= 10; i++) {
				System.out.println(n + " x " + i + " = " + (n * i));
			}
		}
		sc.close();
	}
}
