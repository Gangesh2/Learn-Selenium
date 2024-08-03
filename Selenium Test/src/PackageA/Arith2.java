//Assignment 2 ((((10/2)-2)*2)-2)+2)
package PackageA;

public class Arith2 {
	public int sum(int a1, int b1)
	{
		int c1=a1+b1;
		System.out.println("The sum is" + c1);
		return c1;
		}
	public int sub(int a2, int b2)
	{
		int c2=a2-b2;
		System.out.println("The sub is" + c2);
		return c2;
		}
	public int multi(int a3, int b3)
	{
		int c3=a3*b3;
		System.out.println("The multilication is" + c3);
		return c3;
		}
	public int div(int a4, int b4)
	{
		int c4=a4/b4;
		System.out.println("The division is" + c4);
		return c4;
		}
	public static void main(String[] args) {
		
		Arith2 obj=new Arith2();
		int divresult =obj.div(10, 2);
		int subresult =obj.sub(divresult, 2);
		int multiresult =obj.multi(subresult, 2);
		int subresult1 =obj.sub(multiresult, 2);
		obj.sum(subresult1, 2);
		
	}
	
	
	
	}
