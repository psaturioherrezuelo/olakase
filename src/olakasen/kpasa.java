package olakasen;

public class kpasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		multiplicar_velasco();
		
		
		
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

}
