package condicionais;

import java.util.Scanner;

public class Questao3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x, y;

		System.out.println("Informe o primeiro n�mero: ");
		x = sc.nextDouble();

		System.out.println("Informe o segundo n�mero: ");
		y = sc.nextDouble();

		if (x == y) {
			System.out.println("Os n�meros s�o iguais!");
		}

		if (x < y) {
			System.out.println(y + " � o maior n�mero!");
		}

		if (x > y) {
			System.out.println(x + " � o maior n�mero!");
		}

		sc.close();
	}
}
