/*Leia os quatro valores correspondentes aos eixos 
 * x e y de dois pontos quaisquer no plano, p1(x1,y1)
 *  e p2(x2,y2) e calcule a dist�ncia entre eles, 
 *  mostrando 4 casas decimais ap�s a v�rgula, segundo 
 *  a f�rmula: Distancia = raizQydrade (x2-x1)�+(y2-y1)�
 */


import java.util.Locale;
import java.util.Scanner;

public class uri1015 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		double x2 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double distancia;
		
		distancia = Math.sqrt(Math.pow(x2 - x1, 2)+Math.pow(y2-y1, 2));
		
		System.out.printf("%.4f", distancia);
		sc.close();
	}

}
