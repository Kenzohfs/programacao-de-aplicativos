import java.util.Scanner;

public class F {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salarioMin, salarioFunc;

		System.out.println("Insira o sal�rio m�nimo: ");
		salarioMin = sc.nextDouble();
		
		System.out.println("Insira o sal�rio do funcion�rio: ");
		salarioFunc = sc.nextDouble();

		System.out.println("Quantidade de sal�rio m�nimos ganhos: " + (salarioFunc / salarioMin));

		sc.close();
	}
}
