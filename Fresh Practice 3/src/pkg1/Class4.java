package pkg1;

public class Class4 
{
	public void method1() {
		System.out.println("i am method one");
	}
	public void method2() {
		
		System.out.println("i am method 2");
		
		
	}
	public void method3() {
		System.out.println("i am method 3");
		this.method1();
		this.method4();
		this.method2();
	}
	public void method4() {
		
		System.out.println("i am method4");
	}
	public static void main(String[] args) 
	{
		Class4 obj=new Class4();
		obj.method3();
		
	}
	
		
}
