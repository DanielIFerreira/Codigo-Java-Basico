import java.util.Locale;
import java.util.Scanner;

public class uri1038 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int codigo, quantidade;
		double total = 0;
		System.out.println("--------------------------------------");
		System.out.println("      LANCHONETE SEMPRE BOM");
		System.out.println("--------------------------------------");
		System.out.println("CODIGO      ESPECIFICAÇÂO      PREÇO ");
		System.out.println("--------------------------------------");
		System.out.println("  1         Cachorro Quente    R$4.00");
		System.out.println("  2         X-Salada           R$4.50");
		System.out.println("  3         X-Bacon            R$5.00");
		System.out.println("  4         Torrada simples    R$2.00");
		System.out.println("  5         Refrigerante       R$1.50");
		System.out.println("_____________________________________");
		System.out.println();
		
		System.out.println("Escolha o que você quer comer: ");
		codigo = sc.nextInt();
		System.out.println("Digite a quantidade de Produto: ");
		quantidade = sc.nextInt();
		
		switch(codigo) {
			case 1:
			total = quantidade * 4.00;
			break;
			case 2:
				total = quantidade * 4.50;
			break;
			case 3: 
				total = quantidade * 5.00;
			break;
			case 4:
				total = quantidade * 2.00;
			break;
			case 5:
				total = quantidade * 1.50;
			break;
			
		}
		
		System.out.printf("O valor total a ser pago é R$ %.2f%n", total);
		sc.close();
	}

}
