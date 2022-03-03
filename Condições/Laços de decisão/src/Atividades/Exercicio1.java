package Atividades;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		int n1, n2, n3, maiorNumero, variavelFinal=0;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com um número: ");
		n1= leia.nextInt();
		System.out.println("\nDigite outro número: ");
		n2= leia.nextInt();
		System.out.println("\nDigite outro número: ");
		n3= leia.nextInt();
		
		if(n1 > n2) {
			
			maiorNumero = n1;
		}else {
			
			maiorNumero = n2;
		}
		
		
		if(maiorNumero > n3){
			
			variavelFinal = maiorNumero;
		}else {
			variavelFinal = n3;
		}

		System.out.println("\nO maior número foi: "+ variavelFinal);
		
		leia.close();
	}

}
