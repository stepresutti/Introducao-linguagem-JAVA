package Atividades;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		
		int idade;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com sua idade: ");
		idade= leia.nextInt();
		
		if(idade>=10 && idade<=14) {
			System.out.println("Voc� pertence a categoria INFANTIL!");
		}else if(idade >=15 && idade <=17) {
			System.out.println("Voc� pertence a categoria JUVENIL!");
		}else if(idade >=18 && idade <=25) {
			System.out.println("Voc� pertence a categoria ADULTO!");
		}else {
			System.out.println("Entre novamente com um n�mero v�lido");
		}
		
		leia.close();

	}

}
