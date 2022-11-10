package Answer2;

public class MethodB extends OverridenMethod {
	public void method()
	{
	System.out.println("Scope can be changed in overriden method");	
	}
	
	public static void main(String[] args) {
		MethodB a = new MethodB();
		a.method();
	}

}
