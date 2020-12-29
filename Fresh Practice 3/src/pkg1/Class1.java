package pkg1;

public class Class1
{
	public Class1()
	{
		this(2);
		System.out.println("i am default constructor");
		this.method1();
		this.method2();
	}
	public void method1()
	{
		System.out.println("I am method1");
	}
	public Class1(int a)
	{
		System.out.println("i am one parameterized method");
		
	}
	public void method2()
	{
		System.out.println("I am method 2");
	}
	public static void main(String[] args) 
	{
		Class1 ref1=new Class1();
		ref1.method1();		
	}
}




