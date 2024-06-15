package PackageA;

public class selenium3 {
	public selenium3()
	{
		this(10,20,30);
	System.out.println("default constructor");	
		
	}
	
	public selenium3(int a, int b, int c)
	{
	System.out.println("three parameterized constructor");	
		
	}
	public selenium3(int a)
	{
	System.out.println("one parameterized constructor");	
		
	}
	public selenium3(int a, int b)
	{
	System.out.println("two parameterized constructor");	
		
	}
	public static void main(String[] args)
	{
		selenium3 obj = new selenium3();
		selenium3 obj1 = new selenium3(10);
		selenium3 obj2 = new selenium3(10,20);
		
		
	}
}
