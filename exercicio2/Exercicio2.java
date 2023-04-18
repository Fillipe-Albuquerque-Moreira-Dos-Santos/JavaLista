package exercicio2;

import java.util.Scanner;

public class Exercicio2 {

	double[] alturas = new double[15];

	public void lerAlturas() {

		Scanner sc = new Scanner(System.in);
		// leitura do povo

		for (int i = 0; i < 15; i++) {
			System.out.print("Digite a altura da " + (i + 1) + "ª pessoa: ");
			alturas[i] = sc.nextDouble();
		}

		sc.close();

	}

	public double[] pegaralturas() {
		return alturas;
	}
}
