public class Validator {
    public static void main(String[] args) {
    
        String login;
        String loginpattern = "([0-9]|[a-z]|[A-Z]|[@#$%^&+=]).{5,30}";
        String password;
        String passwordpattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,12}";
    
    
        System.out.println("--------Validação de Login--------\n");
    
        //Login com tamanho menor que 5
        login = "123";
        System.out.println("Teste 001 - Login com tamanho menor que 5");
        System.out.println("Entry: " + login);
        System.out.println("Result: " + login.matches(loginpattern) + "\n");
        
        //Login com tamanho maior que 30
        login = "abcdefghijklmnopqrstuvwxyz123456789";
        System.out.println("Teste 002 - Login com tamanho maior que 30");
        System.out.println("Entry: " + login);
        System.out.println("Result: " + login.matches(loginpattern) + "\n");
        
        //Login com tamanho entre 5 e 30
        login = "seqkwlm";
        System.out.println("Teste 003 - Login com tamanho entre 5 e 30");
        System.out.println("Entry: " + login);
        System.out.println("Result: " + login.matches(loginpattern) + "\n");
        
        System.out.println("--------Validação de Password--------\n");
        
        //Password com tamanho menor que 8
        password = "A1%";
        System.out.println("Teste 004 - Password com tamanho menor que 8");
        System.out.println("Entry: " + password);
        System.out.println("Result: " + password.matches(passwordpattern) + "\n");
        
        //Password com tamanho maior que 12
        password = "abcde123567%$";
        System.out.println("Teste 005 - Password com tamanho maior que 12");
        System.out.println("Entry: " + password);
        System.out.println("Result: " + password.matches(passwordpattern) + "\n");
        
        //Password com tamanho T, ( 8 <= T <= 12), sem letra maiscula
        password = "abcd123$%";
        System.out.println("Teste 006 - Password com tamanho T, ( 8 <= T <= 12), sem letra maiscula");
        System.out.println("Entry: " + password);
        System.out.println("Result: " + password.matches(passwordpattern) + "\n");
        
        //Passowrd com tamanho T, ( 8 <= T <= 12), sem numero
        password = "abcdEFG$%";
        System.out.println("Teste 007 - Password com tamanho T, ( 8 <= T <= 12), sem numero");
        System.out.println("Entry: " + password);
        System.out.println("Result: " + password.matches(passwordpattern) + "\n");
        
        //Passowrd com tamanho T, ( 8 <= T <= 12), sem caractere especial
        password = "abcd123EF";
        System.out.println("Teste 008 - Password com tamanho T, ( 8 <= T <= 12), sem caractere especial");
        System.out.println("Entry: " + password);
        System.out.println("Result: " + password.matches(passwordpattern) + "\n");

        //Passowrd com tamanho T, ( 8 <= T <= 12), com letra maiuscula, numero e caractere especial
        password = "ABc123%$";
        System.out.println("Teste 009 - Password com tamanho T, ( 8 <= T <= 12), com letra maiuscula, numero e caractere especial");
        System.out.println("Entry: " + password);
        System.out.println("Result: " + password.matches(passwordpattern) + "\n");

    }
}