import java.util.ArrayList;
import java.util.Collections;

public class Estoque {
	
	public static void main(String[] args) {
		
		String item1 = "\nMacarr�o";
		String item2 = "\nRefrigerante";
		String item3 = "\nSucos de v�rios sabores";
		String item4 = "\nBolachas, bicoitos e salgadinho";
		String item5 = "\nPresunto, peito de peru, mussarela e mortadela";
		String item6 = "\nArroz, feij�o, sal, a�ucar e �leo";
		String item7 = "\nCebola, alho, tomate e lim�o";
		String item8 = "\nMilho, molho de tomate, azeitonas, creme de leite";
		String item9 = "\nP�o e tapioca";
		String item10 = "\nShamapoo, condicionador, sabonete e pasta de dente";
		
		ArrayList<String>itens = new ArrayList<>();
		
		itens.add(item1);
		itens.add(item3);
		itens.add(item2);
		itens.add(item6);
		itens.add(item7);
		itens.add(item4);
		itens.add(item9);
		itens.add(item5);
		itens.add(item10);
		itens.add(item8);
		
		
		itens.set(0, "\nMacarr�o, lasanha, nhoque");
		itens.remove(6);
		
		Collections.sort(itens);
		
		System.out.println(itens);
		
		
		
	}
}
