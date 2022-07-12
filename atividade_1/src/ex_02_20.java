
import java.util.Scanner;

public class ex_02_20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade, meses, dias;
		
		System.out.println("Informe sua idade: ");
		idade = sc.nextInt();
		
		System.out.println("Informe os meses:");
		meses = sc.nextInt();
		
		System.out.println("Informe os dias:");
		dias = sc.nextInt();
		
		System.out.println("Sua idade em dias: " + ((idade*365) + (meses*30) + dias));
		
		sc.close();
	}
}
