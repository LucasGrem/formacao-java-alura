package ControleTemperatura;

public class Main {
    public static void main(String[] args) {
        Controle controle = new Controle();

        controle.local = "Setor A";
        controle.temperatura = 39.2;

        controle.exibirInformacoes();
    }
}
