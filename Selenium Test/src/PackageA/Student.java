package PackageA;

public class Student {
	int gangesh;
	public void display()
	{
		System.out.println("welcome to all of you");
	}
   public static void main(String[] args)
   {
	Student abc=new Student();
	abc.display();
	abc.display();
	abc.gangesh=20;
	System.out.println("value of gangesh"+abc.gangesh);
}
}
