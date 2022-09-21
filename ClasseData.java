package CursoClasse;

public class ClasseData {
	int dia;
	int mes;
	int ano;
	ClasseData(){
		dia = 1;
		mes = 1;
		ano = 1970;
	}
	ClasseData(int dia2, int mes2, int ano2){
		dia = dia2;
		mes = mes2;
		ano = ano2;
	}
	public String imprimeData() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
}
