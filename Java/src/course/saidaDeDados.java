package course;

import java.util.Locale;

public class saidaDeDados {

	public static void main(String[] args) {
		
	String product1 = "Computer";
	String product2 = "Office desk";
	
	int age = 30;
	int code = 5290;
	char gender = 'F';
	
	double price1 = 2100.0;
	double price2 = 650.50;
	double measure = 53.234567;
	
	Locale.setDefault(Locale.US);
	System.out.printf("Products:%n%s, which price is %.2f%n"
			+ "Office desk which price is %.2f%n",product1,price1,price2);
	
	System.out.printf("%nRecord: %d years old, code %d and gender: %s%n"
			+ "%nMeasue whit eight decimal places: %.6f"
			+ "%nRouded (three decimal places): %.3f%n"
			+ "US decimal point: %.3f", age, code, gender, measure, measure, measure);

	}

}
