import java.util.Scanner;

public class Questão1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("------------MENU------------ \n1 - Somar dois números \n2 - Raiz quadrada de um número");
		int opcao = sc.nextInt();

		if (opcao == 1) {
			System.out.println("Informe o primeiro número");
			double num1 = sc.nextDouble();

			System.out.println("Informe o segundo número");
			double num2 = sc.nextDouble();

			System.out.println("Soma: " + (num1 + num2));
		} else if (opcao == 2) {
			System.out.println("Informe um número: ");
			double num = sc.nextDouble();

			System.out.println("Raiz quadrada: " + Math.sqrt(num));
		} else {
			System.out.println("Opção inválida!");
		}

		sc.close();
	}
}
