package ContaBancaria;

public class Teste {

	public static void main(String[] args) {

		ContaBancaria C = new ContaBancaria(2000);
		
		C.depositar(300);
		System.out.println(C.getSaldo());
		
		C.sacar(300);
		System.out.println(C.getSaldo());
		
		C.sacar(2500);
		System.out.println(C.getSaldo());

	}

}
