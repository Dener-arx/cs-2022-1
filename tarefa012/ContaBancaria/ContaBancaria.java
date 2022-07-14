package ContaBancaria;



public class ContaBancaria {
	private double Saldo;
	
	public ContaBancaria( double Saldo ) {
		this.Saldo = Saldo;
	}
	
	
	public double getSaldo() {
		return Saldo;
	}
	
	
	public void depositar(double valor) {
		Saldo += valor;
	}
	
	public void sacar(double valor) {
		try {
			if (valor > Saldo ) {
				throw new SaldoInsuficienteException("Saldo Insuficiente");
			}
			this.Saldo -= valor;
		}
		catch(SaldoInsuficienteException e) {
			System.out.println(e.getMessage());
		}
	}
}
