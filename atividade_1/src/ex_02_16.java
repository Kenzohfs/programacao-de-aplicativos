
import java.util.Scanner;

public class ex_02_16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double base, altura;
		
		System.out.println("Informe a base do ret�ngulo: ");
		base = sc.nextDouble();
		
		System.out.println("Informe a altura do ret�ngulo: ");
		altura = sc.nextDouble();
		
		System.out.println("�rea do ret�ngulo: " + (base * altura));
		System.out.println("Per�metro do ret�ngulo: " + ((base*2) + (altura*2)));
		
		sc.close();
	}
}
