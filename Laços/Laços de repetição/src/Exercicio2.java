
public class Exercicio2 {

	public static void main(String[] args) {
		
		int num, impar=0, par=0;
		
		for(num=0; num<10; num++) {
			
			if(num%2 == 0){
				par = par+1;
			}
			else if(num%2 != 0) {
				impar = impar+1;
				
			}
		}
		
		System.out.println("SEUS RESULTADOS");
		System.out.printf("%d %s", par, " são par!");
		System.out.printf("\n%d %s", impar, " são ímpar!");
	}

}
