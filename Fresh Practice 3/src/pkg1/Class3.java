package pkg1;

public class Class3 
{
	int a=5;
	
	public void m1(int a)
	{
		this.a=a;
	}
	public static void main(String[] args) 
	{
		Class3 ref1=new Class3();
		ref1.m1(20);
		System.out.println(ref1.a);
		float b=251.2f;
		int c;
		c =(int)b;
		System.out.println(c);
		
		
	}

}
