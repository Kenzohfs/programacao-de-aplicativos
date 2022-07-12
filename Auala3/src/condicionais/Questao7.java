package condicionais;

import java.util.Scanner;

public class Questao7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double i, a, b, c;

		System.out.print("Informe o número A: ");
		a = sc.nextDouble();

		System.out.print("Informe o número B: ");
		b = sc.nextDouble();

		System.out.print("Informe o número C: ");
		c = sc.nextDouble();

		System.out.print("Informe o número I: ");
		i = sc.nextDouble();

		if (i == 1) {
			if (a < b && a < c) {
				if (b < c) {
					System.out.println(a + ", " + b + ", " + c);
				}
				if (c < b) {
					System.out.println(a + ", " + c + ", " + b);
				}
			}
			if (b < a && b < c) {
				if (a < c) {
					System.out.println(b + ", " + a + ", " + c);
				}
				if (c < a) {
					System.out.println(b + ", " + c + ", " + a);
				}
			}
			if (c < a && c < b) {
				if (a < b) {					
					System.out.println(c + ", " + a + ", " + b);
				}
				if (b < a) {
					System.out.println(c + ", " + b + ", " + a);
				}
			}
		}
		if (i == 2) {
			if (a > b && a > c) {
				if (b > c) {
					System.out.println(a + ", " + b + ", " + c);
				}
				if (c > b) {
					System.out.println(a + ", " + c + ", " + b);
				}
			}
			if (b > a && b > c) {
				if (a > c) {
					System.out.println(b + ", " + a + ", " + c);
				}
				if (c > a) {
					System.out.println(b + ", " + c + ", " + a);
				}
			}
			if (c > a && c > b) {
				if (a > b) {					
					System.out.println(c + ", " + a + ", " + b);
				}
				if (b > a) {
					System.out.println(c + ", " + b + ", " + a);
				}
			}
		}
		if (i == 3) {
			if (a > b && a > c) {
				System.out.println(b + ", " + a + ", " + c);
			}
			if (b > a && b > c) {
				System.out.println(a + ", " + b + ", " + c);
			}
			if (c > a && c > b) {
				System.out.println(a + ", " + c + ", " + b);
			}
		}

		sc.close();
	}
}
