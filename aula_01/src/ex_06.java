import java.util.Scanner;

public class ex_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("Digite um número inteiro: ");
		num = sc.nextInt();
		
		System.out.println("O antecessor do número " + num + " é " + (num-1));
		System.out.println("O sucessor do número " + num + " é " + (num+1));
		
		sc.close();
	}
}
