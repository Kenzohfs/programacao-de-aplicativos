import java.util.Scanner;

public class B {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x, y, z;

		System.out.println("Multiplica��o \nInsira um n�mero: ");
		x = sc.nextDouble();

		System.out.println("Insira o segundo n�mero: ");
		y = sc.nextDouble();
		
		System.out.println("Insira o terceiro n�mero: ");
		z = sc.nextDouble();

		System.out.println(x + " * " + y + " * " + z + " = " + (x * y * z));

		sc.close();
	}
}
