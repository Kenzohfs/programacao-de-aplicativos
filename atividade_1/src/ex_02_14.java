
import java.util.Scanner;

public class ex_02_14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("Informe um número: ");
		num = sc.nextInt();
		
		System.out.println("Resultado da divisão por 3: " + (num / 3.0));
		
		sc.close();
	}
}
