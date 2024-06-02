
public class ContaPoupanca extends Conta {

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}
	
	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupanca ===");
		System.out.println(String.format("Agencia: %d", super.agencia));
		System.out.println(String.format("Conta: %d", super.numero));
		System.out.println(String.format("Saldo: %.2f", super.saldo));
	}
	
}
