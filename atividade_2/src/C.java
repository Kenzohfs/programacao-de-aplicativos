import java.util.Scanner;

public class C {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x, y;

		System.out.println("Divis�o \nInsira um n�mero maior que 0: ");
		x = sc.nextDouble();

		System.out.println("Insira o segundo n�mero: ");
		y = sc.nextDouble();

		System.out.println(x + " : " + y + " = " + (x / y));

		sc.close();
	}
}
