import java.util.Scanner;

public class uri1078 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int produto= 0;
		for(int i=1; i <=10;i++ ) {
		produto = i*n;
		System.out.println(i+ " X "+ n+ " = "+ produto );
		}
		
		sc.close();
	}

}
