package MatrizesVetores;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		//Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade e o escreva em seguida. 
		//Encontre após a maior pontuação e a apresente.
			
			Scanner l = new Scanner(System.in);
			
		double[] pontos = new double[5];
		double maiorNota = 0.0;
			
		for( int i = 0; i < pontos.length; i++) {
			System.out.println("Insira a " +(i+1)+"ª nota:");
				pontos[i] = l.nextDouble();
				
		if(pontos[i] > maiorNota) {
					maiorNota = pontos[i];
			}
			}		
			System.out.println("\nA maior nota é: " + maiorNota);
			l.close();
		}
	
}

