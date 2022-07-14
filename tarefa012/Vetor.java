import java.util.InputMismatchException;
import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] array = new int[10];
		int x; 
		int i=0;
		
		System.out.println("Digite 0 para finalizar o vetor de inteiros.");
		
		try {
			while(true) {
				x = sc.nextInt();
				array[i] = x;
				i++;
				
				if (x==0) {
					break;
				}
			}
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Out of Bounds!");
		}
		catch(InputMismatchException e) {
			System.out.println("Mismatch!");
		}
		
		for ( i=0; i<array.length; i++ ) {
			System.out.println(array[i]);
		}
	}

}
