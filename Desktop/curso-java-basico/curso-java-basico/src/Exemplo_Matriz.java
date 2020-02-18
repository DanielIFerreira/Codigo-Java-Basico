import java.util.Scanner;

public class Exemplo_Matriz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int M = sc.nextInt();
		int N =  sc.nextInt();
		
		int [] [] mat = new int [M] [N];
		int cont =0;
		for (int i = 0; i< M; i++) {
			for (int j = 0;j<N; j++) {
				mat[i][j] = sc.nextInt();
				cont = cont + 1;
			}
			
		}
		
		int soma=0;
		for (int i = 0; i< M; i++) {
			for (int j = 0;j<N; j++) {
				
				System.out.print(mat[i][j]+" ");
				soma = soma +mat[i][j];
				
			}
			System.out.println();
		}
		System.out.println(soma);
		System.out.println(cont);
		sc.close();

	}

}
