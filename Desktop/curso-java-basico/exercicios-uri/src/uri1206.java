import java.util.Scanner;

public class uri1206 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		String [] nome = new String [N];
		int [] idade = new int[N];
		
		
		for(int i=0; i<N; i++) {
			nome[i] = sc.next();
			idade[i] = sc.nextInt();
		}
		int maisVelho = idade[0];
		for(int i =0; i<N; i++) {
			if(idade[i] > maisVelho ) {
				maisVelho = idade[i];
				System.out.println("Pessoa mais velha " +nome[i]);
			}
		}
		sc.close();

	}

}
