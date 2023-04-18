package exercicio1;

public class Exercicio1 {

		public int somaImparesMultiplosDeTres(int inicio, int fim) {
			int soma = 0;
			for (int i = inicio; i <= fim; i++) {
				if (i % 2 != 0 && i % 3 == 0) {
					soma += i;
				}
			}
			return soma;
		}
	}


