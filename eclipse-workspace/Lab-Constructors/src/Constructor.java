
public class Constructor {
	public Constructor()
	{
		System.out.println("Default constructor ran.");
	}
	
	public Constructor(int value)
	{
		System.out.println(value);
	}
	
	public static void main(String[] args)
	{
		//create instances here
		Constructor c = new Constructor(5839);
		
		
		// use the no-arg constructor
		Constructor cNoArg = new Constructor();
	}
}
