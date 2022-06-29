




import java.util.logging.Logger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      int y=0;
      int m=0;
      int d=0;
      int t=0;
      int count=0;
      String text;
      boolean isNumber;
      
      Logger logger = Logger.getLogger("MyLog");
      
      Scanner sc = new Scanner(System.in);
      text = sc.nextLine();
      
      String[] words = text.split(" ");

      for( int i=0 ; i<words.length ; i++ ){
          isNumber = words[i].chars().allMatch( Character::isDigit);
          if(isNumber){
             
             count++;

             switch (count) {
                case 1:
                    y = Integer.parseInt(words[i]);
                    continue;
                case 2:
                    m = Integer.parseInt(words[i]);
                    continue;
                case 3:
                    d = Integer.parseInt(words[i]);
                    continue;
                default:
                    continue;
             }
          }
        
      }
      
      t = y*365 + m*30 + d;
             
      logger.info( t + " dias.");
      
    }
  }