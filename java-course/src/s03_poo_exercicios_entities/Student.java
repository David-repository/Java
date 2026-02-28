/* Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
(primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
para o aluno obter o mínimo para ser aprovado (que é 60% da nota). */

package s03_poo_exercicios_entities;

public class Student {
	
	public String Nome;
	public double Nota1;
	public double Nota2;
	public double Nota3;
	
	public double NotaFinal() {
		return Nota1 + Nota2 + Nota3;
	}
	
	public double PontosRestantes() {
		if (NotaFinal() < 60.0) {
		return 60.0 - NotaFinal();
		}
		else {
		return 0.0;
		}
	}
}
