package PackageA;
//Assignment---Five variables, give the values to those variables and print the value of those variables
public class ConstructorA {
	int a,b,c,d,e;
	public ConstructorA(int x1, int x2, int x3, int x4, int x5)
	{
		 a=x1;
		 b=x2;
		 c=x3;
		 d=x4;
		 e=x5;
	}
	public static void main(String[] args) {
		
		ConstructorA obj=new ConstructorA(10,20,30,40,50);
		System.out.println("A" + obj.a);
		System.out.println("B" + obj.b);
		System.out.println("C" + obj.c);
		System.out.println("D" + obj.d);
		System.out.println("E" + obj.e);
			
	}

}
