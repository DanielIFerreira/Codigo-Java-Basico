/*Minutos a ser pago caso passe de 100*/
import java.util.Locale;
import java.util.Scanner;

public class Exemplo_Operadores_de_Atribuição_Acumulativa {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		int minutos = sc.nextInt();
		
		double conta = 50;
		
		if (minutos > 100) {
			conta+=  (minutos - 100)* 2 ;
		}
		
		System.out.printf("Valor a pagar R$ %.2f%n",conta);
		sc.close();
		
		
	}

}
