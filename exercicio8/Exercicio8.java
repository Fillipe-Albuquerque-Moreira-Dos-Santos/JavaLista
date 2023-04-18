package exercicio8;

public class Exercicio8 {  
 
	public int calcularFatorial(int numero) {
	    int fatorial = 1;
	    for (int i = numero; i > 0; i--) {
	        fatorial *= i;
	        System.out.print(i);
	        if (i != 1) {
	            System.out.print(" * ");
	        }
	    }
	    System.out.print(" = ");
	    return fatorial;
	}

}
