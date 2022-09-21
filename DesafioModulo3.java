package CursoJava;
import java.util.Scanner;
public class DesafioModulo3 {
	public static void main(String[] args) {
		double n1, n2, operacao, menu;
		Scanner s = new Scanner(System.in);
		System.out.println("Digite um numero");
		n1 = s.nextDouble();
		System.out.println("Digite um numero");
		n2 = s.nextDouble();
		System.out.println("Agora digite a operação que deseja realizar:"
				+ " 1 para +, 2 para -, 3 para *, 4 para / e 5 para %");
		menu = s.nextDouble();
		operacao = menu == 1 ? n1 + n2: menu == 2 ? n1-n2: menu == 3 ? n1*n2 : menu == 4 ? n1/n2 : menu == 5 ? n1 % n2: 0;
		
		System.out.println(operacao);
		s.close();
	}
}
