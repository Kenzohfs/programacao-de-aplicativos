import java.util.Scanner;

public class ex_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.print("Informe um n�mero: ");
		num = sc.nextInt();
		
		System.out.println("Resultado da divis�o por 3: " + (num / 3.0));
		
		sc.close();
	}
}
