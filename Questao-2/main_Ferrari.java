
public class main_Ferrari {

	public static void main(String[] args) {
		
		Ferrari ferrari;
		ferrari = new Ferrari();
		
		ferrari.ligar(false);
		ferrari.setCor("vermelha");
		ferrari.setModelo("f50");
		ferrari.setVelmax(312);
		ferrari.setVelatual(0);
		ferrari.acelerar(50);
		ferrari.acelerar(50);
		ferrari.acelerar(50);
		
		System.out.println("Cor: " + ferrari.getCor()); 
		System.out.println("modelo: " + ferrari.getModelo());
		System.out.println("velocidade atual: " + ferrari.getVelatual() + " km/h");
		System.out.println("velocidade máxima: " + ferrari.getVelmax() + " km/h");

	}

}
