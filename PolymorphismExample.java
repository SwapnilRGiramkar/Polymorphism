//This is a example of PolyMorphism 
//class Number
package polymorphism;

public class Number 
{
	String email="Swap12@gmail.com";
	String pass="Swa123";
	public Number() {
		
	}
	Number(String email,String pass)
	{
		if(this.email==email && this.pass==pass)
		{
			System.out.println("Login Success");
		}
	}
	public void addition(int a,int b)
	{
		int res=a-b;
		System.out.println(res);
	}
	public void subtraction(int n1,int n2)
	{
		int res=n1+n2;
		System.out.println(res);
	}
	public void multiplication(int n1,int n2)
	{
		int res=n1*n2;
		System.out.println(res);
	}
	public void division(int n1,int n2)
	{
		int res=n1%n2;
		System.out.println(res);
	}
	
//--------------------------------------------------------
//class Number2
package polymorphism;

public class Number2 extends Number
{
	public Number2() {
		// TODO Auto-generated constructor stub
	}
	Number2(String email,String pass)
	{
		super(email,pass);
	}
	
	public void addition(int a,int b)
	{
		int res=a+b;
		System.out.println(res);
	}
	
	public void subtraction(int n1,int n2)
	{
		int res=n1-n2;
		System.out.println(res);
	}
	public void division(int a,int b)
	{
		int res =a/b;
		System.out.println(res);
	}

}
//------------------------------------------------------------
//NumberDriver
package polymorphism;

public class NumberDriver {

	public static void main(String[] args)
	{
		Number n=new Number2("Swap123@gmail.com","Swa123");
		
		n.addition(12, 3);
		n.subtraction(12, 4);
		n.multiplication(2, 3);
	}

}
//-----------------------------------------------------------------
