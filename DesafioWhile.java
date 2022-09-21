package CursoJava;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class DesafioWhile {
	public static void main(String[] args) {
		double nota = 0, media, soma=0;
		String sair = "";
		int i = 0;
		Scanner s = new Scanner(System.in);
		
		while(!sair.equalsIgnoreCase("sair")){
			
			String usuario = JOptionPane.showInputDialog("Digite");
			nota = Double.parseDouble(usuario);
			
			if (nota >= 0 && nota <= 10){
				soma += nota;
				i++;
				System.out.println("Deseja sair?");
				sair = s.nextLine();
			}else{
				System.out.println("Digite valido");
				break;
			}
		}
		
		media = soma/i;
		System.out.println(soma);
		System.out.println(i);
		System.out.println(media);
		s.close();
	}
}
