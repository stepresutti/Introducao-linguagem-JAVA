package Introducao;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		
		double nota1, nota2, nota3, peso1, peso3, peso5, media;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		nota1=leia.nextDouble();
		System.out.println("Digite a segunda nota: ");
		nota2=leia.nextDouble();
		System.out.println("Digite a terceira nota: ");
		nota3=leia.nextDouble();
		
		peso1=nota1*0.2;
		peso3=nota2*0.3;
		peso5=nota3*0.5;
		
		media= peso1+peso3+peso5;
		System.out.println("Sua média ponderada foi de: "+media);
		
		leia.close();
	}

}
