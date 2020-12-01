package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Matriz Quadrada quantas linhas? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		int [][] matriz = new int[n][n];
		
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Diagonal Principal:");
		for(int i = 0; i < matriz.length; i++) {
			System.out.print("(" + matriz[i][i] + ") ");
		}
		System.out.println();
		
		
		int contador = 0;
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j] <0)
					contador++;
			}
		}
		System.out.println();
		System.out.println("Número de elementos negativos: " + contador);
		
		sc.close();

	}

}
