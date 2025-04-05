package bancoDigital;

public class Conta implements IConta{
	
	private static final int AGENCIA_PADRAO = 0;
	private static int SEQUENCIAL = 1;
	
	protected int numero;
	protected int conta;
	protected double saldo;
	protected Cliente cliente;
	
	
	public Conta(Cliente cliente){
		this.numero = Conta.AGENCIA_PADRAO;
		this.conta = SEQUENCIAL++;
		this.cliente = cliente;
	}	
		
	public int getNumero() {
		return numero;
	}
	public int getConta() {
		return conta;
	}
	public double getSaldo() {
		return saldo;
	}

	@Override
	public void sacar(double valor) {
		saldo -= valor; 
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;	
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}	

	
	protected void imprimirInfo() {
		System.out.println(String.format("Titular: %s", this.cliente.getName()));
		System.out.println(String.format("Agencia: %d", this.conta));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

}
