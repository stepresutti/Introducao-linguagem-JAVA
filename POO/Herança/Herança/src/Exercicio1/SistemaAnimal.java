package Exercicio1;

public class SistemaAnimal {

		public static void main(String[] args) {
			
			Cachorro pinscher = new Cachorro();
			Cavalo quartoDeMilha = new Cavalo();
			Preguica selvagem = new Preguica();
			
			//Cachorro
			
			pinscher.setNome("marilu");
			pinscher.setIdade(12);
			pinscher.setEmitirSom("au au au");
			System.out.println("\nO nome do c�o/cadela �: "+pinscher.getNome()+", ele(a) tem "+pinscher.getIdade()+" anos e faz: "+pinscher.getEmitirSom());
			pinscher.comportamento();
			
			
			//Cavalo
			
			quartoDeMilha.setNome("alaz�o");
			quartoDeMilha.setIdade(20);
			quartoDeMilha.setEmitirSom("miiiiiiir pruf");
			System.out.println("\nO nome do cavalo/�gua �: "+quartoDeMilha.getNome()+", ele(a) tem "+quartoDeMilha.getIdade()+" anos e faz: "+quartoDeMilha.getEmitirSom());
			quartoDeMilha.comportamento();
			
			//Pregui�a
			
			selvagem.setNome("soneca");
			selvagem.setIdade(2);
			selvagem.setEmitirSom("ZZzzZzZZZzzZ");
			System.out.println("\nO nome da pregui�a �: "+selvagem.getNome()+", ele(a) tem "+selvagem.getIdade()+" anos e faz: "+selvagem.getEmitirSom());
			selvagem.comportamento();
		}
}
