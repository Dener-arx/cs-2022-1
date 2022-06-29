






import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
    
    Logger logger = Logger.getLogger("MyLog");

    Scanner sc = new Scanner(System.in);
    
    double salmin = sc.nextDouble();
    double saluser = sc.nextDouble();
    
    double q = Math.floor(saluser/salmin);
    
    logger.info( q + "SM=" + saluser );

    }
}