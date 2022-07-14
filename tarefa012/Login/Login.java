package Login;

public class Login {
	private String usuario;
	private String senha;
	
	public Login(String usuario, String senha) {
		this.usuario = usuario;
		this.senha = senha;
	}
		
	
	public boolean fazer_login(String u, String s) {
		try {
			if (!u.equals(usuario) || !s.equals(senha)) {
				throw new LoginInvalidoException("Usuario ou Senha Incorretos.");
			}
			return true;
		}
		catch(LoginInvalidoException e) {
			System.out.println(e.getMessage());
		}
		return false;
	}
}
