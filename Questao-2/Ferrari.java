
public class Ferrari {
	
	private String cor;
	private String modelo;
	private double velatual;
	private double velmax;
	
	boolean ligado;
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public double getVelatual() {
		return velatual;
	}
	
	public void setVelatual(double velatual) {
		this.velatual = velatual;
	}
	
	public double getVelmax() {
		return velmax;
	}
	
	public void setVelmax(double velmax) {
		this.velmax = velmax;
	}
	
	public void ligar(boolean ligado){
		
		if (ligado == false){
			ligado = true;
			System.out.println("O carro foi ligado!");
		} else {
			System.out.println("O carro já está ligado!");
		}
	}
	
	public void acelerar(double speed)
	{
		if (velmax >= (velatual+speed))
			velatual = velatual+speed;
		else
			System.out.println("Velocidade máxima foi excedida");
	}
	
	

}
