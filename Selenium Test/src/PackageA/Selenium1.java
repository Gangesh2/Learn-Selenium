package PackageA;

public class Selenium1 {
	
	int a,b,c,d,e;
	
 public Selenium1(int x1, int x2, int x3 , int x4 , int x5) 
 {
	a=x1;
	b=x2;
	c=x3;
	d=x4;
	e=x5;
 }
 public static void main(String[] args) 
 {
	Selenium1 obj= new Selenium1(10,20,30,40,50);
	
	
	System.out.println(obj.a);
	System.out.println(obj.b);
	System.out.println(obj.c);
	System.out.println(obj.d);
	System.out.println(obj.e);
}
}
