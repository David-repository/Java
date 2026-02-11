package s02_estruturas_controle.exercicios;

import java.util.Scanner;

public class exe1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		
		int N = sc.nextInt();
		
		if(N > 0) {
			System.out.println("Não negativo");
		}
		else {
			System.out.println("Negativo");
		}
		sc.close();
	}

}
