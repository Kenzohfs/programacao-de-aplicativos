import java.util.Scanner;

public class Quest�o1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("------------MENU------------ \n1 - Somar dois n�meros \n2 - Raiz quadrada de um n�mero");
		int opcao = sc.nextInt();

		if (opcao == 1) {
			System.out.println("Informe o primeiro n�mero");
			double num1 = sc.nextDouble();

			System.out.println("Informe o segundo n�mero");
			double num2 = sc.nextDouble();

			System.out.println("Soma: " + (num1 + num2));
		} else if (opcao == 2) {
			System.out.println("Informe um n�mero: ");
			double num = sc.nextDouble();

			System.out.println("Raiz quadrada: " + Math.sqrt(num));
		} else {
			System.out.println("Op��o inv�lida!");
		}

		sc.close();
	}
}
