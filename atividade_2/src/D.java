import java.util.Scanner;

public class D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x;

		System.out.println("Insira o pre�o de um produto: ");
		x = sc.nextDouble();

		System.out.println("O novo pre�o do produto com 10% de desconto � de R$ " + (x * 0.9));

		sc.close();
	}

}
