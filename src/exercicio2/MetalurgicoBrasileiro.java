package exercicio2;

public class MetalurgicoBrasileiro extends Metalurgico{
	
	@Override
	public Motor criarMotor(int x) {
		return new MotorAço(x);
	}

}
