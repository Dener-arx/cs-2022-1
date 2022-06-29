






import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    double ipi = sc.nextDouble();
    int cod1 = sc.nextInt(); 
    double value1 = sc.nextDouble();
    int quant1 = sc.nextInt();
    int cod2 = sc.nextInt(); 
    double value2 = sc.nextDouble();
    int quant2 = sc.nextInt();
    
    
    double total = ((value1*quant1 + value2*quant2)*(ipi/100 + 1));
    
    System.out.printf("Total: %.2f ", total ); 
    }
}