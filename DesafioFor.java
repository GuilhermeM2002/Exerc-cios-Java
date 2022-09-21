package CursoJava;

public class DesafioFor {
	public static void main(String[] args) {
		String valor = "#";
		for(String i = "0"; i.equals(i); i += "1") {
			valor += "#";
			System.out.println(valor);
		}
		System.out.println(valor);
	}	
}
