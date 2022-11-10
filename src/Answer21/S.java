package Answer21;

import java.io.Serializable;

public class S implements Serializable {
	private long studentID;
	private String name;
	private transient int age;
	
	public S(long studentID, String name, int age) {
		super();
		this.studentID = studentID;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "S [studentID=" + studentID + ", name=" + name + ", age=" + age + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	public static void main(String[] args) {
		S obj = new 
	}
	
	

}
