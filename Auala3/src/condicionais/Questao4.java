package condicionais;

import java.util.Scanner;

public class Questao4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x, y, z;

		System.out.print("Informe o primeiro número: ");
		x = sc.nextDouble();

		System.out.print("Informe o segundo número: ");
		y = sc.nextDouble();

		System.out.print("Informe o terceiro número: ");
		z = sc.nextDouble();

		if (x < y && x < z) {
			if (y < z) {
				System.out.println(x + ", " + y + ", " + z);
			}

			if (z < y) {
				System.out.println(x + ", " + z + ", " + y);
			}
		}

		if (y < x && y < z) {
			if (x < z) {
				System.out.println(y + ", " + x + ", " + z);
			}
			if (z < x) {
				System.out.println(y + ", " + z + ", " + x);
			}
		}
		if (z < y && z < x) {
			if (x < y) {
				System.out.println(z + ", " + x + ", " + y);
			}
			if (y < x) {
				System.out.println(z + ", " + y + ", " + x);
			}
		}

		sc.close();
	}
}
