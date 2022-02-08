package prototype;
import prototype.Person;


public class App 
{
    public static void main( String[] args )
    {
        //Singleton prueba1=Singleton.getInstance();
        //Singleton prueba2=new Singleton("Antonio");
        
    	Person prueba1= new Person("Antonio", 42);
    	
    	
    	Person prueba2 = (Person) prueba1.clone();
        System.out.println(prueba1.hashCode());
    	
    	
    }
}
