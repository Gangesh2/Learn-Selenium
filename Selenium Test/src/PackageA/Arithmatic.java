package PackageA;

public class Arithmatic {
	
	public int sum(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("sum result is"+c);
		return c;
	}

	public int sub(int x, int y)
	{
		int z;
		z=x+y;
		System.err.println("sub result is"+z);
		return z;
	}
	
		public void multi(int a1, int a2)
		{
			int result;
			result=a1*a2;
			System.out.println("final result" + result);
			
		}
		public static void main(String[] args)
		{
			Arithmatic obj =new Arithmatic();
			int sumResult=obj.sum(5 , 10);
			int subResult=obj.sub(20, 10);
			obj.multi(sumResult, subResult);
		}
	}

