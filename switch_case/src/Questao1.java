import java.util.Scanner;

public class Questao1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("C�digo do funcion�rio: ");
		int codigo = sc.nextInt();

		System.out.println("Sal�rio: ");
		double salario = sc.nextDouble();

		String cargo = "";
		double aumento = 0, novoSalario = 0;

		switch (codigo) {
		case 1:
			cargo = "Escritu�rio";
			aumento = salario * 0.5;
			novoSalario = salario * 1.5;
			break;
		case 2:
			cargo = "Secret�rio";
			aumento = salario * 0.35;
			novoSalario = salario * 1.35;
			break;
		case 3:
			cargo = "Caixa";
			aumento = salario * 0.2;
			novoSalario = salario * 1.2;
			break;
		case 4:
			cargo = "Gerente";
			aumento = salario * 0.1;
			novoSalario = salario * 1.1;
			break;
		case 5:
			cargo = "Diretor";
			aumento = 0;
			novoSalario = salario;
			break;
		default:
			System.out.println("C�digo inv�lido!");
			System.exit(0);
		}

		System.out.println("Cargo: " + cargo + "\nValor de aumento: " + aumento + "\nNovo Sal�rio: " + novoSalario);

		sc.close();
	}
}
