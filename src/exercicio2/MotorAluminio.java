package exercicio2;

public class MotorAluminio implements Motor{
	private int cilindros;
	private String tipo;
	
	public MotorAluminio(int x) {
		this.tipo = "Aluminio";
		setCilindros(x);
	}
	@Override
	public void setCilindros(int c) {
		
		if(c == 3 || c == 6) {
			this.cilindros = c;
		}else {
			System.out.println("Cilindros nao compativel, apenas 3 ou 6");
		}
		
		
	}
	@Override
	public int getCilindros() {
		return this.cilindros;
	}
	@Override
	public String getTipo() {
		return this.tipo;
	}
	
	
	

}
