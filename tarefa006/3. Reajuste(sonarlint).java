




import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
    
    Logger logger = Logger.getLogger("MyLog");
    
    Scanner sc = new Scanner(System.in);
    double saldo = sc.nextDouble();
    
    logger.info("Reajuste: " + saldo*1.15);

    }
}