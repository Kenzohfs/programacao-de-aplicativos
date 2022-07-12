import java.util.Scanner;

public class D {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double x;

		System.out.println("Insira o preço de um produto: ");
		x = sc.nextDouble();

		System.out.println("O novo preço do produto com 10% de desconto é de R$ " + (x * 0.9));

		sc.close();
	}

}
