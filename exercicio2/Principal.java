package exercicio2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exercicio2 exercicio = new Exercicio2();
		
		exercicio.lerAlturas();
		
		double[] alturas = exercicio.pegaralturas(); 
		
		double maiorAltura = alturas[0];
		double menorAltura = alturas[0];
		
		for (int i = 1; i < 15; i++) {
			if (alturas[i] < menorAltura) {
				menorAltura = alturas[i];
			}
			
			if (alturas[i] > maiorAltura) {
				maiorAltura = alturas[i];
			}
		}
		
		
		System.out.println("A pessoa com a menor altura do grupo é: " + menorAltura + " Metros");
		System.out.println("A pessoa com a menor altura do grupo é: " + maiorAltura + " Metros");

	}

}
