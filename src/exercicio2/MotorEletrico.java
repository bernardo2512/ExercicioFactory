package exercicio2;

public class MotorEletrico implements Motor {
	private int cilindros;
	private String tipo;
	
	public MotorEletrico(int x) {
		this.cilindros = 0;
		this.tipo = "Eletrico";
	}
	
	@Override
	public void setCilindros(int x) {
		this.cilindros = 0;
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
