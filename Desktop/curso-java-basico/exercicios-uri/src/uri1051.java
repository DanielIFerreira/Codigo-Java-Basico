/*Lembre que, se o salário for R$ 3002.00, a taxa que incide é 
 * de 8% apenas sobre R$ 1000.00, pois a faixa de salário que 
 * fica de R$ 0.00 até R$ 2000.00 é isenta de Imposto de Renda. 
 * No exemplo fornecido (abaixo), a taxa é de 8% sobre R$ 1000.00 + 18%
 *  sobre R$ 2.00, o que resulta em R$ 80.36 no total.
 *  O valor deve ser impresso com duas casas decimais.*/
import java.util.Scanner;

public class uri1051 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double sal = sc.nextDouble();
		double imposto=0;
		
		if(sal >= 0 && sal <= 2000) {
			
			System.out.println("Isento");
		}
		else if (sal <= 3000) {
			imposto = (sal-2000)*0.08;
			
		}
		else if(sal <= 4500){ 
				imposto =  (sal-3000)*0.18+1000*0.08;
			}
		else {
			imposto = (sal - 4500)*0.28+1500*0.18+1000*0.08;
		}
		sc.close();
		System.out.printf("R$%.2f", imposto);
	}
}


