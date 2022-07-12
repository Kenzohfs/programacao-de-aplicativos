import java.util.Scanner;

public class ex_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número para saber sua tabuada: ");
		double num = sc.nextDouble();

		for (int i = 0; i < 11; i++) {
			System.out.println(num + " x " + i + " = " + (num * i));
		}

		sc.close();
	}
}
