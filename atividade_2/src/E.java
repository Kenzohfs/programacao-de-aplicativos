import java.util.Scanner;

public class E {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salario, vendas;

		System.out.println("Insira o sal�rio fixo do funcion�rio: ");
		salario = sc.nextDouble();

		System.out.println("Insira o valor das vendas feitas: ");
		vendas = sc.nextDouble();
		
		System.out.println("Comiss�o de R$ " + vendas + ": R$ " + (vendas * 0.04) + "\nSal�rio final: R$" + (salario + (vendas * 0.04)));

		sc.close();
	}
}
