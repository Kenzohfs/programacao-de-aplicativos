import java.util.Scanner;

public class I {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int horas, horasExtras;
		double salarioMin;
		
		System.out.println("Informe o n�mero de horas trabalhadas: ");
		horas = sc.nextInt();

		System.out.println("Informe o valor do sal�rio m�nimo: ");
		salarioMin = sc.nextInt();

		System.out.println("Informe o n�mero de horas extras feitas: ");
		horasExtras = sc.nextInt();
		
		System.out.println("Sal�rio a receber: " + ((horas * (salarioMin / 8)) + (horasExtras * (salarioMin / 4))));
		
		sc.close();
	}
}
