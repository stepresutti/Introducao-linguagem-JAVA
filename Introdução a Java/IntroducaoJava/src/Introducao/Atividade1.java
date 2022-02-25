package Introducao;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		
		int n1, n2, n3;
		Scanner leia = new Scanner(System.in); 
		
		System.out.println("Digite o dia do seu nascimento: ");
		n1=leia.nextInt();
		System.out.println("Digite o mês do seu nascimento: ");
		n2=leia.nextInt();
		System.out.println("Digite o ano do seu nascimento: ");
		n3=leia.nextInt();
				
		LocalDate dataNascimentoUsuario = LocalDate.of(n3, n2, n1);
		LocalDate dataAtual = LocalDate.now();
		
	    long idadeEmDias = ChronoUnit.DAYS.between(dataNascimentoUsuario, dataAtual);
	    
	    System.out.println("Sua idade em dias é:\n" + idadeEmDias + " dias");
	    leia.close();

	}

}
