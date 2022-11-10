package Answer4;

public class SubClass extends SuperClass {
	void display() {
		System.out.println("SubClass");
	}
	
	public static void main(String[] args) {
		SuperClass o = new SubClass();
		o.display();
		
	}
	

}
