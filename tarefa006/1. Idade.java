





import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      int y=0, m=0, d=0, t=0;
      String text;
      boolean isNumber;
      
      Scanner sc = new Scanner(System.in);
      text = sc.nextLine();
      
      String[] words = text.split(" ");

      for( int i=0, count=0 ; i<words.length ; i++ ){
          isNumber = words[i].chars().allMatch( Character::isDigit);
          if(isNumber){
             
             switch (count) {
                case 0:
                    y = Integer.parseInt(words[i]);
                case 1:
                    m = Integer.parseInt(words[i]);
                case 2:
                    d = Integer.parseInt(words[i]);
                
             }
             count++;
          }
        
      }
      
      t = y*365 + m*30 + d;
     
      System.out.println( t + " dias." );
      
    }
  }