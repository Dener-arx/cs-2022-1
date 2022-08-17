package Generics;

public class GenericsClass {

    static <T> void toString(String type, T value) {
        System.out.println("This function received the " + type +  " '" + value + "' as a generic value.");
    }
  
    public static void main(String[] args) {

        toString("Integer" , 11);
        toString("String", "Random Text");
        toString("Double", 7.2);
        
    }
}
