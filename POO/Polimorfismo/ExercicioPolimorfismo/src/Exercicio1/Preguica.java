package Exercicio1;

public class Preguica implements Animais {

	String nome = "Irineu";
	int idade = 12;
	
	
	@Override
	public void emitirSom() {
		System.out.println("Preguica fazendo ZzzZzZzZ");
		
	}


	@Override
	public void comportamento() {
		System.out.println("Preguica subindo em árvore...");
		
	}


}
