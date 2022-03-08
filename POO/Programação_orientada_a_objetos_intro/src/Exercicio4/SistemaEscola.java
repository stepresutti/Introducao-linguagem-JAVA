package Exercicio4;

public class SistemaEscola {

	public static void main(String[] args) {

												// (nome, cargo, salario, tempocasa, ruim e bom)
		Funcionario funcionario1 = new Funcionario ("Maria","Professora", 1200, 10, false, true);
		funcionario1.demitir();
		funcionario1.promover();
		funcionario1.estatizar();
		funcionario1.estado();
		
		Funcionario funcionario2 = new Funcionario ("Marcos","Inspetor", 800, 3, false, true);
		funcionario2.demitir();
		funcionario2.promover();
		funcionario2.estatizar();
		funcionario2.estado();
		
		Funcionario funcionario3 = new Funcionario ("Betania","Professora", 2000, 15, false, true);
		funcionario3.demitir();
		funcionario3.promover();
		funcionario3.estatizar();
		funcionario3.estado();
		
		Funcionario funcionario4 = new Funcionario ("Thiago","Professor", 1000, 7, true, false);
		funcionario4.demitir();
		funcionario4.promover();
		funcionario4.estatizar();
		funcionario4.estado();

	}

}
