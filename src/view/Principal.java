package view;

public class Principal{

	private static void chamadaRecursiva() {
		chamadaRecursiva();	
	}
	
	public static void main(String[] args) {
		chamadaRecursiva();
	}
}