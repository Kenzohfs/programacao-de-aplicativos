import java.util.Scanner;

public class F {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salarioMin, salarioFunc;

		System.out.println("Insira o salário mínimo: ");
		salarioMin = sc.nextDouble();
		
		System.out.println("Insira o salário do funcionário: ");
		salarioFunc = sc.nextDouble();

		System.out.println("Quantidade de salário mínimos ganhos: " + (salarioFunc / salarioMin));

		sc.close();
	}
}
