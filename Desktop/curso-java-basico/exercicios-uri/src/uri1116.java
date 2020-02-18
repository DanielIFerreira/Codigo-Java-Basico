import java.util.Scanner;

public class uri1116 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 0; i <N ; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			
			double div = (double) x / y;
				if( y ==  0) {
					System.out.println("Divisivel Impossivel");
				}
				else {
					System.out.printf("%.1f%n",div);
				}
		}
		
		sc.close();

	}

}
