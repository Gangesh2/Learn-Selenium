package PackageA;
   //Day 1 Assignment
public class Student1 {

	int age;
	int rollno;
	public void display1 ()
	{
		System.out.println("welcome to all of you");
	}
	public void display2()
	{
		System.out.println("Automation is very easy");
	}
	public static void main(String[] args) {
		Student1 abc=new Student1();
		abc.display1();
		abc.display2();
		abc.age=30;
		abc.rollno=35;
		System.out.println("age of Sam" + abc.age);
		System.out.println("rollno of Sam"  + abc.rollno);
	}
}
