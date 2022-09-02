package Login;

public class LoginInvalidoException extends Exception {
	
	public LoginInvalidoException(){
        super();
    }

    public LoginInvalidoException(String message){
        super(message);
    }
}
