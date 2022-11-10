package Answer7;

public class finalC {
	public final String name = " Sam";
	   public final int age= 22;
	   public final finalC(){
	      this.name = "Sam";
	      this.age = 20;
	   }
	   public void display(){
	      System.out.println("Name of the Student: "+this.name );
	      System.out.println("Age of the Student: "+this.age );
	   }
	   public static void main(String args[]) {
	      new finalC().display();
	   }
}
