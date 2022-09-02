import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {
    public static void main(String args[]) {
      
        Scanner sc = new Scanner(System.in);
      
        try{
        	System.out.println("Digite o primeiro numero:");
            double a = sc.nextDouble();
            System.out.println("Digite o segundo numero:");
            double b = sc.nextDouble();
    
            if (b==0){
                throw new ArithmeticException("Divisao por Zero!");
            }
            
            double c = a/b;
            System.out.println("Resultado: " + c); 
            
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        catch(InputMismatchException e){
        	System.out.println("Valor nao numerico!");
        }
      
    }
}