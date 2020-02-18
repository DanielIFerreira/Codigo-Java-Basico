import java.util.Scanner;

public class Exercicio_Resolvido2_While {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int x = sc.nextInt();
		int cont=0;
		int soma=0;
		double media;
		
		
		if (x < 0 ) {
			System.out.println("Impossivel de Calcular!");
		}
		
		while(x >= 0) {
			soma = soma + x;
			cont= cont +1;
			x = sc.nextInt();
		}
		
		media =(double)soma/cont;
		System.out.printf("SOMA = %.2f", media);
		sc.close();

	}

}
