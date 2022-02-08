package prototype;

public class Person implements IPrototype{
	
	
	private String nombre;
	private int edad;
	
	public Person(String nombre, int edad)
	{
		super();
		this.nombre= nombre;
		this.edad=edad;
	}
	public IPrototype clone()
	{
		return new Person(this.nombre, this.edad);
	}
	

}
