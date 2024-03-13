package abstraction;

public class ChilsClass extends ParentClass{

	public static void main(String[] args) {
		ChilsClass nb = new ChilsClass(); // We can get constructor through this instansiation as well
		nb.method1(); // can get the overriden value of abstract class 
		nb.method2(); // 
		ParentClass.display(); // for calling static method from parent class

	}

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		
	}

}
