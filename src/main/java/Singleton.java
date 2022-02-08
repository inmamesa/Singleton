


public class Singleton {

	private static Singleton instancia;
	
	private Singleton(){}
	
	public static void  instance()
	{
		if(instancia == null)
		{
			instancia = new Singleton();
		}
	}
	
	public static Singleton getInstance()
	{
		instance();
		return instancia;
		
	}
}


