
public class FabricaDeCarro {
	
	private static FabricaDeCarro instance;
	private FabricaDeCarro(){		
	}
	public static synchronized FabricaDeCarro getInstance(){
	    if (instance == null)
		    instance = new FabricaDeCarro();
		return instance;
	}
	public String confirmString(){
		if (instance != null)
		{
		return "H� apenas uma inst�ncia dessa classe";
		}
		else
		{
		System.out.println("Erro!");
		}
		return null;
	}
}