package methods;

public class Non_StaticMethods 
{

	public void m1()
	{
		System.out.println("Non Static Method is Running");
	}
	
	public  void dog()
	{
		System.out.println("dog method is Running");
	}
	public  void cat()
	{
		System.out.println("Cat  method is running");
	}
	
	public static void main(String []args)
	{
		
		
		Non_StaticMethods obj=new Non_StaticMethods();
		obj.m1();
		obj.dog();
		obj.cat();
		
	}
	
	
	
}
