package exercicio6;

public class Principal {

	public static void main(String[] args) {

		Exercicio6 impares = new Exercicio6();
		int[] num_impares = impares.getImparesEntre(100, 200);
		for (int i : num_impares) {
			System.out.println(i);
		}

	}

}
