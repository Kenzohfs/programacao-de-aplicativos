import java.util.Scanner;

public class ex_06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("Digite um n�mero inteiro: ");
		num = sc.nextInt();
		
		System.out.println("O antecessor do n�mero " + num + " � " + (num-1));
		System.out.println("O sucessor do n�mero " + num + " � " + (num+1));
		
		sc.close();
	}
}
