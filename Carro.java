package OO;

public class Carro {
	int velocidade = 0;
	int velocidadeMaxima;
	
	public Carro(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}
	
	public void acelerar() {
		velocidade += 5;
	}
	public void frear() {
		if(velocidade == 0) {
			System.out.println("Não é possivel frear um carro parado seu jumento.");
		}else {
			velocidade -= 5;
		}
	}
}
