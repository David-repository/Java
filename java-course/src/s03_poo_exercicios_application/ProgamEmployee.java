/*Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em
seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
afetado pela porcentagem) e mostrar novamente os dados do funcionário. */

package s03_poo_exercicios_application;

import java.util.Locale;
import java.util.Scanner;

import s03_poo_exercicios_entities.Employee;

public class ProgamEmployee {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.println("Name: ");
		employee.Name = sc.nextLine();
		System.out.println("GrossSalary: ");
		employee.GrossSalary = sc.nextDouble();
		System.out.println("Tax: ");
		employee.Tax = sc.nextDouble();
		
		System.out.println();
		System.out.printf("Employee: " + employee);
		
		System.out.println();
		System.out.println("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		employee.IncreaseSalary(percentage);
		
		System.out.println();
		System.out.println("Update data: " + employee);
		
		sc.close();
	}

}
