import java.util.Locale;
import java.util.Scanner;

public class Exercicio_Vetor {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		double [] vet = new double [N];
		double media=0, soma=0;
		for(int i=0; i <N; i++) {
			vet[i] = sc.nextDouble();
		}
		for(int i = 0; i< N; i++) {
			System.out.printf("Numeros digitados = %.1f", vet[i]);
			soma = soma + vet[i];
			media = soma/N;
		}
		System.out.println();
		System.out.printf("SOMA = %.1f%n", soma);
		System.out.printf("MEDIA = %.1f%n",media);
		sc.close();
	}

}
