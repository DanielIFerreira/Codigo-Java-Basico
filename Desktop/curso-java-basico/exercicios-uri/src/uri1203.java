import java.util.Locale;
import java.util.Scanner;

public class uri1203 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double [] vet = new double [N];
		double soma =0, media= 0;
		
		for(int i =0; i<N; i++) {
			vet[i] = sc.nextDouble();
			soma =soma + vet[i];
			media = soma/N;
			}
		System.out.printf("Media = %.3f%n", media);
		
		for(int i =0; i<N; i++) {
			if(vet[i] <= 10) {
				System.out.println(vet[i]);
			}
		}
		sc.close();

	}

}
