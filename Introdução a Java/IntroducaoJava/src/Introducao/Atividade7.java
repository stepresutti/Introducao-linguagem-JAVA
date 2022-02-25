package Introducao;

import java.util.Scanner;

public class Atividade7 {

	public static void main(String[] args) {
		
		int a, b, c, d, e, f, x, y;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		a=leia.nextInt();
		System.out.println("Digite um número: ");
		b=leia.nextInt();
		System.out.println("Digite um número: ");
		c=leia.nextInt();
		System.out.println("Digite um número: ");
		d=leia.nextInt();
		System.out.println("Digite um número: ");
		e=leia.nextInt();
		System.out.println("Digite um número: ");
		f=leia.nextInt();
		
		x=((c*e)-(b*f))/((a*e)-(b*d));
		y=((a*f)-(c*d))/((a*e)-(b*d));
		
		System.out.println("O valor de x foi: " + x + "\nO valor de y foi: "+y);
	}

}
