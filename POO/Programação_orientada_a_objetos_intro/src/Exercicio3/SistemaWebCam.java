package Exercicio3;

public class SistemaWebCam {
		
		public static void main(String[] args) {
			
			WebCam web1 = new WebCam (12567, "preta", "ux1001", false);
			web1.ativarWebCam();
			web1.filmar();
			web1.estado();

		}
}
