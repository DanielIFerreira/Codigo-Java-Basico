import java.util.Locale;
import java.util.Scanner;

public class uri1014 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int distanciaPerco = sc.nextInt();
		double totalCombusGasto = sc.nextDouble();
		double consumo;
		
		consumo = distanciaPerco / totalCombusGasto;
		
		System.out.printf("TOTAL DE CONSUMO: %.3f", consumo);
		
		sc.close();
	}

}
