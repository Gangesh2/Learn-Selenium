package PackageA;

public class Student2 {
	int abc;
	public void me1()
	{
		System.out.println("welcome guys");
	}
  public static void main(String[] args) {
	Student2 obj= new Student2();
	obj.me1();
	obj.abc=500;
	System.out.println("no of student" + obj.abc);
}
}
