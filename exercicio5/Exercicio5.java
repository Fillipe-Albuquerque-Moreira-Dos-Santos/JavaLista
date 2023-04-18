package exercicio5;

public class Exercicio5 {

	private int quantidadePares;
	private int quantidadeImpares;
	private int somaPares;
	private int quantidadeTotal;

	public void adicionarNumero(int numero) {
		if (numero % 2 == 0) {
			quantidadePares++;
			somaPares += numero;
		} else {
			quantidadeImpares++;
		}
		quantidadeTotal++;
	}

	public int getQuantidadePares() {
		return quantidadePares;
	}

	public int getQuantidadeImpares() {
		return quantidadeImpares;
	}

	public double getMediaPares() {
		if (quantidadePares > 0) {
			return (double) somaPares / quantidadePares;
		} else {
			return 0;
		}
	}

	public double getMediaGeral() {
		if (quantidadeTotal > 0) {
			return (double) somaPares / quantidadeTotal;
		} else {
			return 0;
		}
	}

}
