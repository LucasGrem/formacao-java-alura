package SistemaBancario;

public class Conta {
    double saldo;

    public void exibirSaldo() {
        System.out.printf("O saldo é R$%.2f", saldo);
    }

    public void zerarSaldo() {
        saldo = 0;
    }
}
