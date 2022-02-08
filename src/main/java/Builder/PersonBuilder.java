package Builder;

import prototype.IPrototype;
import prototype.Person;

public class PersonBuilder implements IPrototype{
	
	private String nombre;
	private int edad;
	
	public PersonBuilder(String nombre, int edad)
	{
		super();
		this.nombre= nombre;
		this.edad=edad;
	}
	
	public PersonBuilder(PersonBuilder personBuilder)
	{
		super();
		this.nombre= personBuilder.nombre;
		this.edad=personBuilder.edad;
	}
	
	public static PersonBuilder builder()
	{
		return new PersonBuilder();
	}
	
	public static class PersonBuilder
	{
		private String nombre;
		private int edad;
		
		public PersonBuilder nombre(String nombre)
		{
			
		}
	}
	
	public IPrototype clone()
	{
		return new Person(this.nombre, this.edad);
	}

}
