package exercicio2;

public class MotorAço implements Motor {
	private int cilindros;
	private String tipo;
	
	public MotorAço(int x) {
		this.tipo = "Aço";
		setCilindros(x);

	}
	@Override
	public void setCilindros(int c) {
		if(c == 4 || c == 8) {
			this.cilindros=c;
		}else {
			System.out.println("Cilindros nao compativel, apenas 4 ou 8");
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
