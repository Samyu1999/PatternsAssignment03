package Answer25;

interface Say{
	void say();
}

public class MethodRef {
	public static void saySomething() {
		System.out.println("This is the feature of Java 8 ");
	}
	
	public static void main(String[] args) {
		Say s = MethodRef::saySomething;
		s.say();
	}

}
