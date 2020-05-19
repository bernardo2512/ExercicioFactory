package exercicio2;

public class MetalurgicoJapones extends Metalurgico {
	
	@Override
	public Motor criarMotor(int x) {
		return new MotorEletrico(x);
	}
}
