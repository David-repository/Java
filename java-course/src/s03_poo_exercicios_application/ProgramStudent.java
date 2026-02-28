/* Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
para o aluno obter o mínimo para ser aprovado (que é 60% da nota). */

package s03_poo_exercicios_application;

import java.util.Locale;
import java.util.Scanner;

import s03_poo_exercicios_entities.Student;

public class ProgramStudent {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Nome do aluno: ");
		student.Nome = sc.nextLine();
		System.out.println("Nota do primeiro trimestre: ");
		student.Nota1 = sc.nextDouble();
		System.out.println("Nota do segundo trimestre: ");
		student.Nota2 = sc.nextDouble();
		System.out.println("Nota do terceiro trimestre: ");
		student.Nota3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f%n", student.NotaFinal());
		
		if(student.NotaFinal() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", student.PontosRestantes());
		} else {
			System.out.println("PASS");
		}
		
		sc.close();

	}

}
