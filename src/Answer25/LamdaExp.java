package Answer25;

interface Sayable{
	public String say(String name) ;
}

public class LamdaExp {
	public static void main(String[] args) {
		Sayable s =(name)->{
			return "Hello: " +name;
		};
		System.out.println(s.say("S"));
		
		Sayable s1=name->{
			return "Hello: "+name;
		};
		System.out.println(s1.say("S1"));
		
		
	}

}
