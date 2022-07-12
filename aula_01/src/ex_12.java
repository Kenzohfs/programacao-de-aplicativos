import java.util.Scanner;

public class ex_12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num;
		
		System.out.println("Informe um número: ");
		num = sc.nextDouble();
		
		System.out.println("Valor com reajuste: " + (num * 1.01));
		
		sc.close();
	}
}
