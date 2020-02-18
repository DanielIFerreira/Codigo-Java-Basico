import java.util.Locale;
import java.util.Scanner;

public class uri1017 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int tempo = sc.nextInt();
		int quilometroPorH = sc.nextInt();
		double gasto;

		gasto = (double)tempo * quilometroPorH / 12;

		System.out.printf("%.3f", gasto);

		sc.close();
	}

}
