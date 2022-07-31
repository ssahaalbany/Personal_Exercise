interface MathOperations
{
	public int add (int a, int b);
	public int sub (int a, int b);
	public int div (int a, int b);
	public int mult(int a, int b);


}

class SciCalc implements MathOperations{
	@Override
	public int add (int a, int b)
	{
		return a+b;
	}
	@Override
	public int sub (int a, int b)
	{
		return a-b;

	}
	@Override
	public int div (int a, int b)
	{
		return a/b;
	}
	//@Override 
	public int mult(int a, int b)
	{
		return a*b;
	}



}

public class Inter{
	public static void main (String[]args)
	{
	SciCalc calc = new SciCalc();
	System.out.println(calc.add(100,200));
	processCalc(calc);

	}

	public static void processCalc(MathOperations op)/* How MathOperation ? *?*/
	{
		//op.add(10,20);
		System.out.println(op.mult(10,20));
	}
}
