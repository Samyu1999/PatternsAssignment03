package Answer3;
import java.util.*;
import java.lang.*;
import java.io.*;
 
class CovariantType {
}
  
  class Base {
	   CovariantType fun()
	    {
       System.out.println("Base fun()");
	      return new CovariantType();
	    }
	}
  class Derived extends Base {
	  B fun()
	    {
	        System.out.println("Derived fun()");
	      return new B();
	    }
	   public class ReturnType {
	 
	    public  static void main(String args[]) {
	    {
	         Base base = new Base();
	         base.fun();
	         Derived derived = new Derived();
	         derived.fun();
	    }
	    }
	}
  }
	

	