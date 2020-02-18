import java.util.Scanner;
public class uri1007 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int valorA = sc.nextInt();
		int valorB = sc.nextInt();
		int valorC = sc.nextInt();
		int valorD = sc.nextInt();
		int diferenca;
		
			diferenca = (valorA * valorB) - (valorC * valorD);
		
			System.out.println("Diferença = " + diferenca);
		sc.close();
		
	}

}
