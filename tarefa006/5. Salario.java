






import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    double salmin = sc.nextDouble();
    double saluser = sc.nextDouble();
    
    double q = Math.floor(saluser/salmin);
    
    System.out.printf("%.0fSM=%.2f ", q, saluser ); 
    }
}