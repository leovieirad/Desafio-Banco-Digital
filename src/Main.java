public class Main {
    public static void main(String[] args) {
        Cliente leonardo = new Cliente();
        leonardo.setNome("Leonardo");

        Conta cc = new ContaCorrente(leonardo);
        Conta poupanca = new ContaPoupanca(leonardo);

        System.out.println("=== Operações Iniciais ===");
        System.out.println("Depósito de 100 na Conta Corrente");
        cc.depositar(100);
        cc.imprimirExtrato();
        cc.consultarSaldo();
        cc.imprimirHistoricoTransacoes();
        System.out.println();

        System.out.println("Transferência de 100 da Conta Corrente para a Conta Poupança");
        cc.transferir(100, poupanca);
        System.out.println("=== Extrato Após Transferência ===");
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        cc.consultarSaldo();
        poupanca.consultarSaldo();
        cc.imprimirHistoricoTransacoes();
        poupanca.imprimirHistoricoTransacoes();
        System.out.println();

        System.out.println("Saque de 20 da Conta Corrente");
        cc.sacar(20);
        System.out.println("=== Extrato Após Saque ===");
        cc.imprimirExtrato();
        cc.consultarSaldo();
        cc.imprimirHistoricoTransacoes();
        System.out.println();

        System.out.println("Depósito de 50 na Conta Poupança");
        poupanca.depositar(50);
        System.out.println("=== Extrato Final ===");
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        cc.consultarSaldo();
        poupanca.consultarSaldo();
        cc.imprimirHistoricoTransacoes();
        poupanca.imprimirHistoricoTransacoes();
    }
}
