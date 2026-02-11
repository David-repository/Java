package s02_estruturas_controle.exercicios;

import java.util.Scanner;

public class exe2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		
		int N = sc.nextInt();
		
		if (N % 2 == 0) {
			System.out.println("Par");
		}
		else {
			System.out.println("Impar");
		}
		sc.close();
	}

}
