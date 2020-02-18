import java.util.Locale;
import java.util.Scanner;

public class uri1019 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();

		
		
		int horas = n/3600;
		int resto = n%3600;
		
		int minutos =resto /60;
		int segundos = resto%60;
		
		System.out.printf(horas+":"+minutos+ ":" +segundos);
		
		sc.close();
	}

}
