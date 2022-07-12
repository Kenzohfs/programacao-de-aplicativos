import java.util.Scanner;

public class I {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int horas, horasExtras;
		double salarioMin;
		
		System.out.println("Informe o número de horas trabalhadas: ");
		horas = sc.nextInt();

		System.out.println("Informe o valor do salário mínimo: ");
		salarioMin = sc.nextInt();

		System.out.println("Informe o número de horas extras feitas: ");
		horasExtras = sc.nextInt();
		
		System.out.println("Salário a receber: " + ((horas * (salarioMin / 8)) + (horasExtras * (salarioMin / 4))));
		
		sc.close();
	}
}
