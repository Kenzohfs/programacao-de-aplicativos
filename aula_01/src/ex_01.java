import java.util.Scanner;

public class ex_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		
		System.out.println("Digite um n�mero: ");
		x = sc.nextInt();
		
		System.out.println("O n�mero digitado foi " + x);
		
		sc.close();
	}
}
