package bancoDigital;

public class Main {
	public static void main(String[]args) {
		
			Cliente Guilherme = new Cliente();
			Guilherme.setName("Guilherme");
			
			Conta cc = new ContaCorrente(Guilherme);
			Conta poupanca = new ContaPoupanca(Guilherme);

			cc.depositar(500);
			cc.transferir(100, poupanca);
			
			cc.imprimirExtrato();
			poupanca.imprimirExtrato();
	}
}
