/*Menor Valor Digitado*/
import java.util.Scanner;

public class Exercico_Resolvido3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int priValor = sc.nextInt();
		int segValor = sc.nextInt();
		int terValor = sc.nextInt();
		
		if (priValor < segValor && priValor < terValor) {
			System.out.println("MENOR VALOR " + priValor);
		}
		else if (segValor <priValor && segValor < terValor) {
			System.out.println("MENOR VALOR " + segValor);
		}
		else {
			System.out.println("MENOR VALOR " + terValor);
		}
			
		
		
		sc.close();
	}

}
