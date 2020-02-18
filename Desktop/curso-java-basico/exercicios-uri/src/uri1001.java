import java.util.Scanner;
import java.util.Locale;

public class uri1001 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int soma = a + b;
		
		System.out.println("X = " + soma);
		sc.close();

	}

}
