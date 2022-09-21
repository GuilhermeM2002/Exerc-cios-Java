package OO;

public class Ferrari extends Carro {
	public Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
	}
	public void acelerar(){
		velocidade += 15;
	}
}
