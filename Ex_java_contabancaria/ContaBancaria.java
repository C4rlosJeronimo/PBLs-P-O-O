public class ContaBancaria {
    private int numero;
    private double saldo;
    private Cliente cliente;
    private static int contadorContas = 1;

    public ContaBancaria(Cliente cliente) {
        this.numero = ++contadorContas;
        this.saldo = 0.0;
        this.cliente = cliente;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            this.saldo -= valor;
        }
    }

    public void exibirExtrato() {
        System.out.println("Extrato da conta " + numero);
        System.out.println("Saldo atual: " + saldo);
    }
}
