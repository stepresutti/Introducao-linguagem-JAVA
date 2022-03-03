package Atividades;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		int num1;
		double raiz, potencia;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com um número: ");
		num1 = leia.nextInt();
		
		
		if(num1%2 == 0) {
			
			raiz = Math.sqrt(num1);
			System.out.println("O número inserido é par e sua raiz é "+ raiz);
			
		}else {
			potencia = Math.pow(num1, 2);
			System.out.println("O número inserido é ímpar e sua potência é: "+ potencia);
		}
		
		leia.close();
	}

}
