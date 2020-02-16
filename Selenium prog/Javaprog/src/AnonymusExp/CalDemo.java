package AnonymusExp;

public class CalDemo
{

	public static void main(String[] args)
	{
		Calculator cal=new Calculator() {
		@Override
	public void add(int a, int b) 
		{
		System.out.println(a+b);
		}
   @Override
	public void sub(int a, int b)
   {
	System.out.println(a-b);
   }
   @Override
	public void mul(int a, int b)
   {
		System.out.println(a*b);
	}
@Override
	public void divide(int a, int b) {
		System.out.println(a/b);
		}

};
cal.add(10, 12);
cal.sub(30,45);
cal.mul(12,12);
cal.divide(12,2);
}
}