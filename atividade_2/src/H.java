import java.util.Scanner;

public class H {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salario, conta1, conta2;

		System.out.println("Insira o sal�rio do Jo�o: ");
		salario = sc.nextDouble();

		System.out.println("Insira o valor da primeira conta: ");
		conta1 = sc.nextDouble();
		
		System.out.println("Insira o valor da segunda conta: ");
		conta2 = sc.nextDouble();
		
		System.out.println("Quantidade de reais que sobrar� do sal�rio do Jo�o: " + (salario - ((conta1 * 1.02) + (conta2 * 1.02))));

		sc.close();
	}
}
