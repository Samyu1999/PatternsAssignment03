package Answer6;

public class StringClass {
	public static void main(String[] args) {
		System.out.println("Testing of Hashcode in String class");
		String s = "Sam";
		System.out.println(s.hashCode());
		s = s+"yu";
		System.out.println(s.hashCode());
		
		System.out.println("Testing of Hashcode in StringBuffer class");
		StringBuffer s1 = new StringBuffer("Hi");
		System.out.println(s1.hashCode());
		s1.append(" Everyone");
		System.out.println(s1.hashCode());
		
	}
	

}
