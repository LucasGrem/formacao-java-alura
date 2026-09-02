package ControleTemperatura;

public class Controle {
    String local;
    double temperatura;

    public void exibirInformacoes() {
        System.out.println("Local = " + local);
        System.out.printf("Temperatura %.1f ºC\n", temperatura);

        if (temperatura > 37.5) {
            System.out.println("Alerta: Temperatura acima do limite!");
        } else if (temperatura > 28.5) {
            System.out.println("Temperatura está normal");
        } else {
            System.out.println("Alerta: Temperatura abaixo do limite!");
        }
    }
}
