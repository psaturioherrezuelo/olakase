package olakasen;

public class kpasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		tablasPablo();

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

}
