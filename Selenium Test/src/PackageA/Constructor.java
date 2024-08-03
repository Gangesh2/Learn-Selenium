package PackageA;

public class Constructor {
public Constructor() 
{
	this(20);
	// TODO Auto-generated constructor stub
	System.out.println("default");
}
  
public Constructor(int a) 
{
	
	// TODO Auto-generated constructor stub
	System.out.println("one parameterized");
}
public Constructor(int a, int b) 
{
	// TODO Auto-generated constructor stub
	System.out.println("two parameterized");
}
 public static void main(String[] args) {

	Constructor obj1 = new Constructor(20);
	Constructor obj2 = new Constructor(20,12);
	Constructor obj3 = new Constructor();
	
}
}
