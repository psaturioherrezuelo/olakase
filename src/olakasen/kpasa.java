package olakasen;

public class kpasa {

	public static void main(String[] args) {
		
		tablaEze();
	}

	private static void tablaEze() {
		String linea="";
		for (int tabla=1; tabla<=10; tabla++) {
		linea="";
			for (int multiplo=1; multiplo<=10; multiplo++) {
				linea+=(multiplo+"x"+tabla+"= "+multiplo*tabla+"  \t");
			}
			System.out.println(linea);
		}
	}
}
