




import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    double saldo = sc.nextDouble();
    
    System.out.printf("Reajuste: %.2f", saldo*1.15);

    }
}