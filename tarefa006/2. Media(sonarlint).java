





import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
    
    Logger logger = Logger.getLogger("MyLog");

    double m1 = (8+9+7)/3.00;
    double m2 = (4+5+6)/3.00;
    
    logger.info("A média aritmética de 8, 9, 7 é: " + m1);
    logger.info("A média aritmética de 4, 5, 6 é: " + m2);
    logger.info("A soma das médias é: " + (m1+m2));
    logger.info("A média das médias é: " + (m1+m2)/2);
    }
}