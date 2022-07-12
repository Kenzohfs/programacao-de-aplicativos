import java.util.Scanner;

public class Bhaskara {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a, b, c;

		System.out.println("Informe o valor de a: ");
		a = sc.nextDouble();

		System.out.println("Informe o valor de b: ");
		b = sc.nextDouble();

		System.out.println("Informe o valor de c: ");
		c = sc.nextDouble();

		double delta = Math.pow(b, 2) - (4 * a * c);

		System.out.println("X' = " + ((-(b) + (delta)) / 2 * a));
		System.out.println("X'' = " + ((-(b) - (delta)) / 2 * a));

		sc.close();
	}
}
