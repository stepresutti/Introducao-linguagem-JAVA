package Introducao;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Atividade3 {
	
	public static void main(String[] args) {
		
		int duracao;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Qual foi a duração do seu evento em segundos?");
		duracao=leia.nextInt();
		
		long hours = TimeUnit.SECONDS.toHours(duracao);
		duracao -= TimeUnit.HOURS.toSeconds(hours);

		long minutes = TimeUnit.SECONDS.toMinutes(duracao);
		duracao -= TimeUnit.MINUTES.toSeconds(minutes);

		long seconds = duracao;
			
		System.out.println("\nA duação do seu evento em horas, minutos e"+
				" segundos foi: " + hours + " hora(s) " + minutes + 
				" minuto(s), e " + seconds + " segundo(s)."  );
		
		 leia.close();
	}

}
