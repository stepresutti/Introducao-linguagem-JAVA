package Introducao;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		
		int x1, x2, y1, y2;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Atribua um valor para x1: ");
		x1=leia.nextInt();
		System.out.println("Atribua um valor para y1: ");
		y1=leia.nextInt();
		System.out.println("Atribua um valor para x2: ");
		x2=leia.nextInt();
		System.out.println("Atribua um valor para y2: ");
		y2=leia.nextInt();
		
		int sub1= x2-x1;
		int sub2= y2-y1;
		
		double pot1= Math.pow(sub1, 2);
		double pot2= Math.pow(sub2, 2);
		
		double d= Math.sqrt(pot1+pot2);
		
		System.out.println("Seu resultado é:  "+d);
		
		leia.close();
		
	}

}
