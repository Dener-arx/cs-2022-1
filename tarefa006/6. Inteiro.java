




import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    int i = sc.nextInt();
    
    System.out.println("Antecessor: " + (i-1)); 
    System.out.println("Sucessor: " + (i+1));
    }
}