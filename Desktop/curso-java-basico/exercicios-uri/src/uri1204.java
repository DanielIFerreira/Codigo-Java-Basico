import java.util.Scanner;

public class uri1204 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		double [] vet = new double [N];
		
		
		for(int i=0; i<N; i++) {
			vet[i] = sc.nextDouble();
		}
		
	int cont =0,soma=0;
	double media = 0;
	
		for(int i=0; i<N; i++) {
			if(vet[i] % 2==0) {
				cont = cont +1;
				soma = (int) (soma+vet[i]);
				media = soma/cont;
				System.out.println(vet[i]);
			}
		}
		System.out.println(soma);
		System.out.println(media);
		sc.close();

	}

}
