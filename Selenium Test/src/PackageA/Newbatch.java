package PackageA;

public class Newbatch {
	int rollno;
	int age;
	public void display1()
	{
		System.out.println("welcome to all of you");
		}
    public void display2()
    {
    	System.out.println("Automation is very easy");
    }
    public static void main(String[] args) {
		Newbatch obj= new Newbatch();
		obj.rollno=100;
		obj.age=30;
		System.out.println("Roll no is" + obj.rollno);
		System.out.println("Age is" + obj.age);
		obj.display1();
		obj.display2();
	}
}
