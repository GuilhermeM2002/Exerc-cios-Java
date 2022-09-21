package CursoJava;
import javax.swing.JOptionPane;
public class DesafioConvesao {
	public static void main(String[]args) {
		
		String valor1 = JOptionPane.showInputDialog("Digite seu salario");
		
		String valor2 = JOptionPane.showInputDialog("Digite seu fuking salario");
		
		String valor3 = JOptionPane.showInputDialog("Cansei! digita qualquer coisa ai");
		
		double valo1 = Double.parseDouble(valor1);
		double valo2 = Double.parseDouble(valor2);
		double valo3 = Double.parseDouble(valor3);
		double resultado = (valo1 + valo2 + valo3)/3;
		System.out.println(resultado);
	}
}
