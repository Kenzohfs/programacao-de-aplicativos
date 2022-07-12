package condicionais;

import java.util.Scanner;

public class Questao5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x, y, z, w;

		System.out.println("Informe o primeiro número da ordem crescente");
		x = sc.nextDouble();

		System.out.println("Informe o segundo número da ordem crescente");
		y = sc.nextDouble();

		System.out.println("Informe o terceiro número da ordem crescente");
		z = sc.nextDouble();

		System.out.println("Informe o quarto número");
		w = sc.nextDouble();

		if (w > z) {
			System.out.print(w + ", " + z + ", " + y + ", " + x);
		} 
		if (w > y) {
			System.out.print(z + ", " + w + ", " + y + ", " + x);
		} 
		if (w > x) {
			System.out.print(z + ", " + y + ", " + w + ", " + x);
		} 
		if (x > w) {
			System.out.print(z + ", " + y + ", " + x + ", " + w);
		}

		sc.close();
	}
}
