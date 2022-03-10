package Exercicio1;

public class Cachorro implements Animais{
	
	String nome = "Jubileu";
	int idade = 4;
	
	@Override
	public void emitirSom() {
		System.out.println("Cachorro fazendo au au au");
			
		}

	@Override
	public void comportamento() {
		System.out.println("Cachorro correndo...");
		
		}

	
}
