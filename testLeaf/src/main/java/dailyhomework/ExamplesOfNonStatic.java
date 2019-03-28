package dailyhomework;

public class ExamplesOfNonStatic {
	
	static String s1 = "hello";
	String s2="World";
	//Static method
	public static void method1()
	{
		 System.out.println("i:"+ s1);
		   //System.out.println("i:"+s2);
	}
	
	//non-static method
	public void method2()
	{
	    //Static method called in non-static method
		method1();
	}
		
		public static void main(String args[])
		{
			ExamplesOfNonStatic obj = new ExamplesOfNonStatic();
			  //You need to have object to call this non-static method
			  obj.method2();
			  
		    //Static method called in another static method
			  method1();
		 }
		}
	

