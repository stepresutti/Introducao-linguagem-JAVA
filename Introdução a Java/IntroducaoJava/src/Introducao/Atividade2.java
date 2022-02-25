package Introducao;

import java.time.LocalDate;
import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
		int idadeEmDias;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite sua idade em dias");
		idadeEmDias=leia.nextInt();
		
		LocalDate dataAtual = LocalDate.now();
		
		LocalDate dataNascimento = dataAtual.minusDays(idadeEmDias);
		
		System.out.println("Sua idade é: "+ dataNascimento);
		
		leia.close();

	}

}
