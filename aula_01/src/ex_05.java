import java.util.Scanner;

public class ex_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x;
		
		System.out.println("Digite um número inteiro: ");
		x = sc.nextInt();
		
		System.out.println("O número inteiro digitado foi " + x);
		
		sc.close();
	}
}
