package Login;

public class Teste {

	public static void main(String[] args) {

		Login l = new Login("abcs", "efty");
		
		
		boolean test1 = l.fazer_login("abcs", "efty");
		System.out.println(test1);

		boolean test2 = l.fazer_login("abcd", "efty");
		System.out.println(test2);
		
		boolean test3 = l.fazer_login("abcs", "eftr");
		System.out.println(test3);
	}

}
