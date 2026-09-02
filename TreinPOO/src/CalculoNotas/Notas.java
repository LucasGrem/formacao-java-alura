package CalculoNotas;

public class Notas {
    String nome;
    double nota1;
    double nota2;

    public void exbibirNotas() {
        double media = (nota1 + nota2) / 2;

        System.out.println("Aluno: " + nome);
        System.out.printf("Nota 1: %.1f\n" +
                "Nota 2: %.1f\n" +
                "Média: %.1f\n", nota1, nota2, media);

        if (media >= 7) {
            System.out.println("Situação: aprovado");
        } else {
            System.out.println("Situação: reprovado");
        }
    }
}
