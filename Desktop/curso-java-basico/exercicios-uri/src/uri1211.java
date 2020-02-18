import java.util.Scanner;

public class uri1211 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int N = sc.nextInt();
		
		int [][] matQuadrada = new int [N][N];
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				matQuadrada[i][j] = sc.nextInt();
			}
		}
		
		int [] vet = new int [N];
		
		for(int i = 0; i<N; i++) {
			int soma=0;
			for(int j = 0; j < N; j++) {
				soma = soma + matQuadrada[i][j];
				
			}
		vet[i] = soma;
		}
		for(int i = 0; i<N; i++) {
			
				System.out.println(vet[i]);
		
		}
		
		sc.close();

	}

}
