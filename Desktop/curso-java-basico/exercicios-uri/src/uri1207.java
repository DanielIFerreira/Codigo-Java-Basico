import java.util.Locale;
import java.util.Scanner;

public class uri1207 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner (System.in);
		
		int N = sc.nextInt();
		double [] vetAltura = new double [N];
		String [] vetSexo = new String[N];
		int cont =0;
		for(int i=0; i<N; i++) {
			vetAltura[i] = sc.nextDouble();
			vetSexo[i] = sc.next();
			if(vetSexo[i] == "M") {
				
			}
		}
		
		
	double	maiorAltura = vetAltura[0];
	double menorAltura = vetAltura[0];
		for(int i =0; i<N; i++) {
			if(vetAltura[i] > maiorAltura) {
				maiorAltura = vetAltura[i];
			}
			else if(vetAltura[i] < menorAltura){
				menorAltura = vetAltura[i];
			}
		}
		for(int i =0; i<N; i++) {
			
		}
		
		System.out.println(menorAltura);
		System.out.println(maiorAltura);
		System.out.println(cont);
		sc.close();

	}

}
