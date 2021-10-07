package MatrizesVetores;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
	        
	        Scanner leia = new Scanner(System.in);
	        
	        double[][] N1 = new double[4][6];
	        double[][] N2 = new double[4][6];
	        double[][] M1 = new double[4][6];
	        double[][] M2 = new double[4][6];
	        
	    for( int linha = 0; linha < N1.length; linha++) {
	    for (int c = 0; c <N1[linha].length; c++) {
	        System.out.printf("Digite os valores da matriz N1 [%d %d]: ",linha,c);
	              N1[linha][c] = leia.nextDouble();
	            }
	        }
	        System.out.println();
	        
	    for (int linha = 0; linha < N2.length; linha++) {
	    for(int c = 0; c < N2[linha].length; c++) {
	        System.out.printf("Digite os valores da matriz N2 [%d %d]: ",linha,c);
	                N2[linha][c] = leia.nextDouble();
	            }
	        }
	        System.out.println("\n\nM1 = N1 + N2");
	     for( int l = 0; l < M1.length; l++) {
	     for (int c = 0; c <M1[l].length; c++) {
	                M1[l][c] = N1[l][c] + N2[l][c];
	        System.out.printf("["+M1[l][c]+"] ");
	            }
	        System.out.println();
	        } 
	        System.out.println("\n\nM2 = N1 - N2");
	        
	      for( int linha = 0; linha < M2.length; linha++) {
	      for( int c = 0; c <M2[linha].length; c++) {
	                M2[linha][c] = N1[linha][c] - N2[linha][c];
	         System.out.printf("["+M2[linha][c]+"]");
	            }
	         System.out.println();
	        }
	        leia.close();
	}

}
