package exercicio2;

public class MetalurgicoAlemao extends Metalurgico{
	
	
	@Override
	public Motor criarMotor(int x) {
		return new MotorAluminio(x);
	}
}
