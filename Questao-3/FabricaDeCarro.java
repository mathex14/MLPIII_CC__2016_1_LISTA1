
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
		return "Há apenas uma instância dessa classe";
		}
		else
		{
		System.out.println("Erro!");
		}
		return null;
	}
}