package olakasen;

public class kpasa {

	public static void main(String[] args) {
		
		tablasPablo();

		multiplicar_velasco();
		
    tablaEze();
		
	}
	
	public static void multiplicar_velasco() {
		int num1 = 10;
		int num2 = 10;
		String tabla = "";
		for (int i = 1; i < num1; i++) {
			for (int j = 1; j < num2; j++) {
				tabla += j + " * " + i + " = " + (i*j) + "\t ";
			}
			tabla += "\n";
		}
		System.out.println(tabla);
	}
	
	public static void tablasPablo() {
		
		int tablas=10;
		
		for(int i=1;i<=tablas;i++) {
			
			System.out.println("\n----------\n"
					+ "Tabla del " + i + 
					"\n----------\n");
			
			for(int j = 0; j<10; j++) {
				
				System.out.println(i + " * " + j + " = " + i*j);
				
			}
			
		}
	
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
