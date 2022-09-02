package Closure;

public class ClosureClass implements Greeting {
	
	public String text(){
		return "Good Morning!";
	}
	
	public static void main(String[] args){
		
		ClosureClass obj = new ClosureClass();
        System.out.println(obj.text());
	
	}
}
