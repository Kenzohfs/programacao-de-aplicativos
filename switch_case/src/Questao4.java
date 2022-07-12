import java.util.Scanner;

public class Questao4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o valor da compra: ");
		double valor = sc.nextDouble();

		System.out.println(
				"Informe sua escolha de compra: \n1 - Pagamento à vista \n2 - Pagamento com cheque pré-datado para 30 dias \n3 - Pagamento parcelado em 6 vezes \n4 - Pagamento parcelado em 12 vezes");
		int opcao = sc.nextInt();

		double valorTotal = valor, valorParcela = 0;
		int qtdParcelas = 6;

		switch (opcao) {
		case 1:
			valorTotal = valor * 0.85;
			break;
		case 2:
			valorTotal = valor * 0.9;
			break;
		case 3:
			valorTotal = valor;
			qtdParcelas = 6;
			valorParcela = valorTotal / qtdParcelas;
			break;
		case 4:
			valorTotal = valor * 1.08;
			qtdParcelas = 12;
			valorParcela = valorTotal / qtdParcelas;
			break;
		}

		String diferenca = "Desconto";
		double diferencaValor = valor - valorTotal;
		
		if (diferencaValor < 0) {
			diferenca = "Juros";
			diferencaValor *= -1;
		}
		
		String texto = "Valor total da compra: " + valor + "\nValor final: " + valorTotal + "\n" + diferenca + ": "
				+ diferencaValor;
		
		if (opcao > 2) {
			texto += "\nQuantidade de parcelas: " + qtdParcelas + "\nValor parcela: "
					+ valorParcela;
		}

		System.out.println(texto);

		sc.close();
	}
}
