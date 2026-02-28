/* Fazer um programa para ler os valores da largura e altura
de um retângulo. Em seguida, mostrar na tela o valor de
sua área, perímetro e diagonal. */

package s03_poo_exercicios_entities;

public class Rectangle {
	
	public double Width;
	public double Height;
	
	public double area() {
		return Width * Height;
	}

	
	public double perimeter() {
		return 2 * (Width + Height);
	}
	
	public double diagonal() {
		return Math.sqrt(Width * Width + Height * Height);
	}
	
	
			
}
