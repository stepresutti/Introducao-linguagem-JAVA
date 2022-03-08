package Exercicio1;

public class App {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Caio","Masculino", 22, 5, false);
		cliente1.fidelizar();
		cliente1.estado();
		
		Cliente cliente2 = new Cliente("Fabiana","Feminino", 30, 11, true);
		cliente2.fidelizar();
		cliente2.estado();
		
		
		Cliente cliente3 = new Cliente("Júlia","Feminino", 31, 6, true);
		cliente3.fidelizar();
		cliente3.estado();
	
		
		
		Cliente cliente4 = new Cliente("Bruno","Masculino", 46, 5, false);
		cliente4.fidelizar();
		cliente4.estado();
		
		
		Cliente cliente5 = new Cliente("Pedro","Masculino", 18, 1, false);
		cliente5.fidelizar();
		cliente5.estado();
		
		
	
	}

}
