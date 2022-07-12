
import java.util.Scanner;

public class ex_02_16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double base, altura;
		
		System.out.println("Informe a base do retângulo: ");
		base = sc.nextDouble();
		
		System.out.println("Informe a altura do retângulo: ");
		altura = sc.nextDouble();
		
		System.out.println("Área do retângulo: " + (base * altura));
		System.out.println("Perímetro do retângulo: " + ((base*2) + (altura*2)));
		
		sc.close();
	}
}
