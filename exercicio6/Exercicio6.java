package exercicio6;

public class Exercicio6 {

	public int[] getImparesEntre(int inicio, int fim) {

		int tamanho = (fim - inicio) / 2 + 1;
		int[] impares = new int[tamanho];
		int indice = 0;
		for (int i = inicio; i <= fim; i++) {
			if (i % 2 != 0) {
				impares[indice] = i;
				indice++;
			}
		}
		return impares;
	}

}
