package exercicio2;

public class Main {
	private static Metalurgico metalurgico;

	public static void main(String[] args) {
		metalurgico = new MetalurgicoBrasileiro();
		Motor m1 = metalurgico.criarMotor(4);
		Motor m2 = metalurgico.criarMotor(8);
		metalurgico = new MetalurgicoAlemao();
		Motor m3 = metalurgico.criarMotor(6);
		System.out.println(m3.getCilindros());
		System.out.println(m3.getTipo());
		
		
		
		
		
		
		
		

	}

}
