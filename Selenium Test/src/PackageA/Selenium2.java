package PackageA;
// To call the three constructor together
public class Selenium2 {
 
	public Selenium2() 
	
	{
		System.out.println("default constructor...");
	}
    public Selenium2(int a) 
	{
		System.out.println("one parameterized constructor...");
	}
    public Selenium2(int a, int b) 
   	{
   		System.out.println("two parameterized constructor...");
   	}
    public static void main(String[] args) 
    {
		Selenium2 obj=new Selenium2(10,20);
		Selenium2 obj1=new Selenium2();
		Selenium2 obj2=new Selenium2(10);
	}

}