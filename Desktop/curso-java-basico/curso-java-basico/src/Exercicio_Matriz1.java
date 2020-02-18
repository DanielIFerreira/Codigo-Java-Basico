import java.util.Scanner;

public class Exercicio_Matriz1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		double [][] mat = new double [M][N];
		
		for(int i =0; i<M; i++) {
			for(int j =0; j<N;j++) {
				mat[i] 
						[j] = sc.nextDouble();
			}
		}
		double [] vet = new double [M];
		
		for(int i =0; i<M; i++) {
			double somaN = 0;
			for(int j =0; j<N; j++) {
				
				somaN= somaN +mat[i][j];
				
			}
		vet[i] = somaN;
		}
		for(int i =0; i<M;i++) {
		System.out.printf("%.2f%n",vet[i]);
		}
		sc.close();

	}

}
