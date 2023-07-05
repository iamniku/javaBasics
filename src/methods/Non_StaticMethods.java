package methods;

public class Non_StaticMethods 
{

	public void m1()
	{
		System.out.println("Non Static Method is Running");
	}
	
	public static void dog()
	{
		System.out.println("Static method is Running");
	}
	public static void cat()
	{
		System.out.println("Cat static method is running");
	}
	
	public static void main(String []args)
	{
		
		
		Non_StaticMethods obj=new Non_StaticMethods();
		obj.m1();
		dog();
		cat();
		
	}
	
	
	
}
