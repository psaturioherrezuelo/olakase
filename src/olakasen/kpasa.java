package olakasen;

public class kpasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hola mis panas aqui teneis el codigo para solucionar vuestros problemas con las mates =)");
		
		tablaMultiplicarJorge();
	}

	
	
	public static void tablaMultiplicarJorge() {
		for (int i = 1; i <= 10; i++) {
			System.out.println("\n"+"La tabla del: "+ i);
			for (int j = 1; j <= 10; j++) {
				System.out.println(i+" x "+j+" = "+i*j);
			}
		}
	}
}
