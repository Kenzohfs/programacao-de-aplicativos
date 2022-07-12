package condicionais;

import java.util.Scanner;

public class Questao3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x, y;

		System.out.println("Informe o primeiro número: ");
		x = sc.nextDouble();

		System.out.println("Informe o segundo número: ");
		y = sc.nextDouble();

		if (x == y) {
			System.out.println("Os números são iguais!");
		}

		if (x < y) {
			System.out.println(y + " é o maior número!");
		}

		if (x > y) {
			System.out.println(x + " é o maior número!");
		}

		sc.close();
	}
}
