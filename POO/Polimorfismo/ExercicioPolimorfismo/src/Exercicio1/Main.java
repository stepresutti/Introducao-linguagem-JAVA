package Exercicio1;

public class Main {

	public static void main(String[] args) {
		
		Cachorro jubileu = new Cachorro();
		Cavalo marianinho = new Cavalo();
		Preguica irineu = new Preguica();
		
		String nomeCachorro = jubileu.nome;
		int idadeCachorro = jubileu.idade;
		System.out.println("Nome do cachorro: "+nomeCachorro+ "\nIdade do cachorro: "+idadeCachorro);
		jubileu.emitirSom();
		jubileu.comportamento();
		

		String nomeCavalo = marianinho.nome;
		int idadeCavalo = marianinho.idade;
		System.out.println("\nNome do cavalo: "+nomeCavalo+ "\nIdade do cavalo: "+idadeCavalo);
		marianinho.emitirSom();
		marianinho.comportamento();
		

		String nomePreguica = irineu.nome;
		int idadePreguica = irineu.idade;
		System.out.println("\nNome da preguiça: "+nomePreguica+ "\nIdade da preguiça: "+idadePreguica);
		irineu.emitirSom();
		irineu.comportamento();
	}

}
