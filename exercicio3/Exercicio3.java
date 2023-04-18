package exercicio3;

public class Exercicio3 {

	private int quantidadeValores;
    private int somaValores;
    private int quantidadePositivos;
    private int quantidadeNegativos;

    public void adicionarValor(int valor) {
        quantidadeValores++;
        somaValores += valor;

        if (valor > 0) {
            quantidadePositivos++;
        } else if (valor < 0) {
            quantidadeNegativos++;
        }
    }

    public double calcularMedia() {
        return (double) somaValores / quantidadeValores;
    }

    public int getQuantidadePositivos() {
        return quantidadePositivos;
    }

    public int getQuantidadeNegativos() {
        return quantidadeNegativos;
    }

    public double getPercentualPositivos() {
        return (double) quantidadePositivos / quantidadeValores * 100;
    }

    public double getPercentualNegativos() {
        return (double) quantidadeNegativos / quantidadeValores * 100;
    }

}
