import java.util.Scanner;

public class ex_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		
		System.out.println("Digite um número: ");
		x = sc.nextInt();
		
		System.out.println("O número digitado foi " + x);
		
		sc.close();
	}
}
