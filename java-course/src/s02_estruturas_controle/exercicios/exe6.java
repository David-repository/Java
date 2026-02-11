package s02_estruturas_controle.exercicios;

import java.util.Scanner;

public class exe6 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int x = sc.nextInt();
		
		for (int i=1; i<=x; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
		
		sc.close();
	}

}
