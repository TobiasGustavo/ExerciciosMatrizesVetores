package MatrizesVetores;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
	

	    Scanner entrada = new Scanner(System.in);

	    double[] lancamentoDado = new double [10];

	    double media = 0.0, soma = 0.0, maiorPont = 0.0, vezesLancadas = 0.0;

	    for (int i = 0; i < lancamentoDado.length; i++) {
	        System.out.println("O valor do dado lançado: ");
	        lancamentoDado[i] = entrada.nextDouble();

	        soma += lancamentoDado[i];

	        System.out.println(soma);

	    if (maiorPont < lancamentoDado[i]) {
	            maiorPont = lancamentoDado[i];
	        }
	        }
	    for (int i = 0; i < lancamentoDado.length; i++) {
	        if (lancamentoDado[i] == maiorPont ) {
	            vezesLancadas ++;
	        }
	        }
	       	System.out.println("\nO maior número foi repetido: " +vezesLancadas+ " vezes.");

	    media = soma / lancamentoDado.length;
	    	System.out.println("\nA média dos números lançados é: " + media);
	}

}
