/*Leia a hora inicial e a hora final de um jogo. 
 * A seguir calcule a dura��o do jogo, sabendo que o mesmo 
 * pode come�ar em um dia e terminar em outro, tendo uma 
 * dura��o m�nima de 1 hora e m�xima de 24 horas.
 * */
import java.util.Scanner;

public class uri1046 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hI, hF,h;
		
		System.out.println("Qual a hora inicial do jogo: ");
		hI = sc.nextInt();
		System.out.println("Qual a hora final do jogo: ");
		hF = sc.nextInt();
		
		
		if (hI < hF) {
			h = hF - hI;
		}
		else {
			h = 24 - hI + hF;
		}
		
		
		System.out.printf("O JOGO TEVE DUR��O DE %d HORA(S)",h);
		
		sc.close();
	}

}
