
import java.util.Scanner;

public class ex_02_18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double base, altura;
		
		System.out.print("Informe o tamanho da base: ");
		base = sc.nextDouble();

		System.out.print("Informe o tamanho da altura: ");
		altura = sc.nextDouble();
		
		System.out.println("�rea = " + (base * altura)/2);
		
		sc.close();
	}
}
