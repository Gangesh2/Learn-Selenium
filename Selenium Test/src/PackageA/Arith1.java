//Assignment1 (((((10+2)*2)-2)*2)/2)
package PackageA;
public class Arith1 {
	
 public int sum(int a1, int b1)
	{
	int c1;
	c1=a1+b1;
	System.out.println("Sum result is" +c1);
	return c1;
	}
	public int sub(int a2, int b2)
	{
		int c2;
		c2=a2-b2;
		System.out.println("Sub result is" + c2);
		return c2;
	}
	public int multi(int a3, int b3)
	{
		int c3;
		c3=a3*b3;
		System.out.println("Multiplication result is" + c3);
		return c3;
	}
	public int div(int a4, int b4)
	{
		int c4;
		c4=a4/b4;
		System.out.println("Div result is" + c4);
		return c4;
	}
	public static void main(String[] args) 
	{
		Arith1 obj=new Arith1();
		int sumresult = obj.sum(10, 2);
		int subresult = obj.sub(sumresult,2);
		int multiresult = obj.multi(subresult, 2);
		int multiresult1 =obj.multi(multiresult, 2);
		obj.div(multiresult1, 2);
	}
	}
