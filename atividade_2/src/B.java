import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x, y, z;

		System.out.println("Multiplicação \nInsira um número: ");
		x = sc.nextDouble();

		System.out.println("Insira o segundo número: ");
		y = sc.nextDouble();
		
		System.out.println("Insira o terceiro número: ");
		z = sc.nextDouble();

		System.out.println(x + " * " + y + " * " + z + " = " + (x * y * z));

		sc.close();
	}
}
