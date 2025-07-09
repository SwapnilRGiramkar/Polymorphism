//parent class
package polymorphism;

public class Subg 
{
	int bullet=30;
	String email="Swap123@gmail.com";
	String user="Hunt";
	public Subg() {
		super();
	}
	Subg(String email,String user)
	{
		if(this.email==email && this.user==user )
		{
			System.out.println("Login Success...!");
		}
	}
	
	public void turnRight()
	{
		System.out.println("Turn Right ");
	}
	public void turnLeft()
	{
		System.out.println("Turn Right ");
	}
	
	public void moveForward()
	{
		System.out.println("one step Forward");
	}
	public void moveBackward()
	{
		System.out.println("one step Forword");
	}
	
	public void fired()
	{
		if(bullet > 0)
		{
			System.out.println("fired..!");
			bullet--;
			System.out.println(bullet);
		}
		
		else 
			System.out.println("please reload..!");
	}
	public void reload()
	{
		bullet=30;
		System.out.println("Reloaded");
		System.out.println(bullet);
	}
}
//child class
package polymorphism;

public class Subg2 extends Subg
{
	public Subg2()
	{
		super();
	}
	Subg2(String email,String user)
	{
		super(email,user);
	}
	
	public void turnLeft()
	{
		System.out.println("Turn Left ");
	}
	
	public void moveBackward()
	{
		System.out.println("one step Backward");
	}
}
//--------------------------------------------------------------------
//Driver class
package polymorphism;

public class SubgDriver {

	public static void main(String[] args) 
	{
		Subg s=new Subg2("Swap123@gmail.com","Hunt");//Upcasting
		s.moveForward();
		s.moveBackward();
		s.fired();
		s.fired();
		s.fired();
		s.fired();
		s.fired();
		s.fired();
		s.fired();
		s.fired();
		s.fired();
		s.reload();
	}

}

