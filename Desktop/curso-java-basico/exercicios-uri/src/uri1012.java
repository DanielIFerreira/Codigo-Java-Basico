import java.util.Scanner;

public class uri1012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		double areaTringulo;
		double areaCirculo;
		double areaTrapezio;
		double areaQuadradoB;
		double areaTrianguloAb;
		double pi = 3.14159;
		
		areaTringulo = (A * C)/2;
		areaCirculo = C * C * pi;
		areaTrapezio = ((A + B) * C)/2;
		areaQuadradoB = B * B ;
		areaTrianguloAb = A * B; 
		
		System.out.printf("TRIANGULO: %.3f%n",areaTringulo);
		System.out.printf("CIRCULO: %.3f%n", areaCirculo);
		System.out.printf("TRAPEZIO: %.3f%n", areaTrapezio);
		System.out.printf("QUADRADO: %.3f%n", areaQuadradoB);
		System.out.printf("RETANGULO: %.3f%n", areaTrianguloAb);
		sc.close();

	}

}
