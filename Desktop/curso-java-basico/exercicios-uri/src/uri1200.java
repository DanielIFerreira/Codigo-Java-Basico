import java.util.Scanner;

public class uri1200 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		int N = sc.nextInt();
		
		int [] vet = new int [N];
		
		for(int  i = 0; i< N ; i++) {
			vet[i] = sc.nextInt();
		}
		int cont= 0;
		for(int i =0; i<N ; i++) {
			if (vet[i]%2 ==0) {
			System.out.print("{"+vet[i]+"}");
				cont = cont+1;
			}
		}
		System.out.println();
		System.out.println(cont);
		sc.close();

	}

}
