package SistemaBancario;

public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta();

        conta.saldo = 1579.42;
        conta.exibirSaldo();
        conta.zerarSaldo();
        conta.exibirSaldo();
    }
}
