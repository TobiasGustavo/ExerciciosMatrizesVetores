package MatrizesVetores;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		Scanner l = new Scanner(System.in);
		
		double[] valor = new double[5];
		double maiorNota = 0.0;
		
		for( int i = 0; i < valor.length; i++) {
			System.out.println("Insira a " + (i+1) + " ª nota:");
			valor[i] = l.nextDouble();
			
			if(valor[i] > maiorNota) {
				maiorNota = valor[i];
			}
		}		
		System.out.println("\nA maior nota é: " + maiorNota);
		l.close();
	}

}