package Exercicio7;

public class SistemaHospital {

	public static void main(String[] args) {
		
												//nome, idade, genero, covid, poucaurgencia, urgente, emergencia, prioridade
		PacientePS paciente1 = new PacientePS ("Stephanie", 22, "Feminino", false, false, true, false, false);
		paciente1.transferirAla();
		paciente1.transferirT3();
		paciente1.transferirT2();
		paciente1.transferirT1();
		paciente1.transferirPO ();
		paciente1.estado ();

}
}
