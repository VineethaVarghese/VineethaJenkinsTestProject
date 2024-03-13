package abstraction;

public abstract class ParentClass {
	
	
	public ParentClass()
	{
		System.out.println("Constructor can be achieved");
	}
	
	public abstract void method1(); // here only abstract class declaration happens
	
	public void method2()
	{
	 System.out.println("Hello");
	}
	
	public static void display()
	{
	System.out.println("Non Abstract method can be achieveed");
	}

}
