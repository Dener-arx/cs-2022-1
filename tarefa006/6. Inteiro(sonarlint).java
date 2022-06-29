




import java.util.Scanner;
import java.util.logging.*;

public class Main {
    public static void main(String[] args) {
    
    Logger logger = Logger.getLogger("MyLog");

    Scanner sc = new Scanner(System.in);
    int i = sc.nextInt();
    
    logger.info("Antecessor: " + (i-1));
    logger.info("Sucessor: " + (i+1));
    }
}