package Exercicio1;

public class Cavalo implements Animais {

	String nome = "Marianinho";
	int idade = 20;
	
	@Override
	public void emitirSom() {
		System.out.println("Cavalo fazendo miiiirrrr pruf");
	}

	@Override
	public void comportamento() {
		System.out.println("Cavalo correndo...");
	}


}
