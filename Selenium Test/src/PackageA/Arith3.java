package PackageA;
//Assignment (((((10+2)+9)/7)-1)*50)
public class Arith3 {
	public int sum(int a, int b) 
	{
		int c=a+b;
		System.out.println("The sum result is" + c);
		return c;
	}
	public int div(int a1, int b1) 
	{
		int c1=a1/b1;
		System.out.println("The div result is" + c1);
		return c1;
	}
	public int sub(int a2, int b2)
	{
		int c2=a2-b2;
		System.out.println("The sub result is" + c2);
		return c2;
	}
	
	public int multi(int a3, int b3)
	{
		int c3=a3*b3;
		System.out.println("The multi result is" + c3);
		return c3;
	}
	public static void main(String[] args) {
		Arith3 obj=new Arith3();
		int sumresult =obj.sum(10, 2);
		int sumresult1 =obj.sum(sumresult, 9);
		int divresult = obj.div(sumresult1, 7);
		int subresult= obj.sub(divresult, 1);
		obj.multi(subresult, 50);
	}
	

}
