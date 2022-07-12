import java.util.Scanner;

public class ex_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double num;
		boolean primo;
		
		do {
			primo = true;
			System.out.println("Informe um número: ");
			num = sc.nextDouble();
			
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					primo = false;
				}
			}
			
			if(primo) {
				System.out.println("O número " + num + " é primo!");
			} else {
				System.out.println("O número " + num + " não é primo!");
			}
			
		} while (num > 1);
		
		sc.close();
	}
}
