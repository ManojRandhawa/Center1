package pkg1;

public class Class2 
{
	public void method1()
	{
		System.out.println("I am method 1");
	}
	public void method2()
	{
		System.out.println("I am method 2");
	}
	public void method3()
	{
		System.out.println("I am method 3");
		this.method1();
		this.method4();
		this.method2();
	}
	public void method4()
	{
		System.out.println("I am method 4");
	}
	public static void main(String[] args) 
	{
		Class2 ref1=new Class2();
		ref1.method3();
	}

}
