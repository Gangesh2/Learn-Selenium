package PackageA;

public class Selenium {
 
	public Selenium() 
	
	{
		System.out.println("default constructor...");
	}
    public Selenium(int a) 
	{
		System.out.println("one parameterized constructor...");
	}
    public Selenium(int a, int b) 
   	{
   		System.out.println("two parameterized constructor...");
   	}
    public static void main(String[] args) 
    {
		Selenium obj=new Selenium(10,20);
	}

}
