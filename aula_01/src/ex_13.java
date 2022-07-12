import java.util.Scanner;

public class ex_13 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num1, num2;
		
		System.out.println("Informe o valor da base do retângulo");
		num1 = sc.nextDouble();
		
		System.out.println("Informe o valor da altura do retângulo");
		num2 = sc.nextDouble();
		
		System.out.println("Área: " + num1 * num2);
		System.out.println("Perímetro: " + (num1*2 + num2*2));
		
		sc.close();
	}
}
