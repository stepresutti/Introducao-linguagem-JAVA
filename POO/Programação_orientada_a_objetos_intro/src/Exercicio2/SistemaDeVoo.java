package Exercicio2;

public class SistemaDeVoo {
	
	public static void main(String[] args) {
		
		Aviao aviao1 = new Aviao ("LATAM", 3243, 100, 96);
		aviao1.estado();
		
		Aviao aviao2 = new Aviao ("GOL", 2631, 100, 100);
		aviao2.estado();
		
		Aviao aviao3 = new Aviao ("GOL", 9621, 100, 103);
		aviao3.estado();
		
		Aviao aviao4 = new Aviao ("AZUL", 7520, 100, 99);
		aviao4.estado();
		
		Aviao aviao5 = new Aviao ("EMIRATES", 0326, 100, 98);
		aviao5.estado();
	}

}
