import java.util.Scanner;

public class ex_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1, num2;
		
		System.out.print("Informe um n�mero: ");
		num1 = sc.nextDouble();
		
		System.out.print("Informe outro n�mero: ");
		num2 = sc.nextDouble();
		
		System.out.println("M�dia: " + (num1 + num2)/2.0);
		
		sc.close();
	}
}
