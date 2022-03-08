package Exercicio6;

public class SistemaContBank {

	public static void main(String[] args) {

			ContaBancaria contaBancaria1 = new ContaBancaria ("Maria",256396894, 9000);
			contaBancaria1.chequeEspecial();
			contaBancaria1.pegarEmprestimo();
			contaBancaria1.ganharCredito();
			contaBancaria1.estado();
			
			ContaBancaria contaBancaria2 = new ContaBancaria ("Mario",564895120, -125000);
			contaBancaria2.chequeEspecial();
			contaBancaria2.pegarEmprestimo();
			contaBancaria2.ganharCredito();
			contaBancaria2.estado();
			
			ContaBancaria contaBancaria3 = new ContaBancaria ("Roberto",245189787, 0);
			contaBancaria3.chequeEspecial();
			contaBancaria3.pegarEmprestimo();
			contaBancaria3.ganharCredito();
			contaBancaria3.estado();
			
	}

}

