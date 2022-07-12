
import java.util.Scanner;

public class ex_02_13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2;
		
		System.out.print("Informe o primeiro número: ");
		num1 = sc.nextInt();

		System.out.print("Informe o segundo número: ");
		num2 = sc.nextInt();
		
		System.out.println("PRODUTO: " + (num1 * num2));
		
		sc.close();
	}
}
