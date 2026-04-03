public class ContaBancaria {

    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;

    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depositado realizado com Sucesso!");
        } else {
            System.out.println("Valor Inválido!");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Sacado realizado com Sucesso!");
        } else  {
            System.out.println("Saldo insuficiente ou valor inválido!");
        }
    }

    public void mostrarSaldo () {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo R$ " + saldo);

    }


}
