import java.util.Scanner;

public class Questao5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int codigo;
		double salario;

		System.out.println("Informe o c�dgo do cargo: ");
		codigo = sc.nextInt();

		System.out.println("Informe seu sal�rio: ");
		salario = sc.nextDouble();

		String cargo = "Diretor";
		double valorAumento = 0;

		if (codigo == 1) {
			cargo = "Escritu�rio";
			valorAumento = salario * 0.5;
			salario += valorAumento;
		} else if (codigo == 2) {
			cargo = "Secret�rio";
			valorAumento = salario * 0.35;
			salario += valorAumento;
		} else if (codigo == 3) {
			cargo = "Caixa";
			valorAumento = salario * 0.2;
			salario += valorAumento;
		} else if (codigo == 4) {
			cargo = "Gerente";
			valorAumento = salario * 0.1;
			salario += valorAumento;
		}

		System.out.println("Cargo: " + cargo + "\nValor aumento: " + valorAumento + "\nSal�rio: " + salario);

		sc.close();
	}
}
