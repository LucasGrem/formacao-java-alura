package CorrigirCadastro;

public class Colaborador {
    String nome;
    String cargo;
    int nivelAcesso;

    public void exibirColaborador() {
        System.out.println("--- Antes da atualização ---");
        System.out.printf("Nome: %s\n" +
                "Cargo: %s\n" +
                "Nível de acesso: %s\n", nome, cargo, nivelAcesso);
    }

    public void atuliazarColaborador(String novoCargo, int novoNivelAcesso) {
        cargo = novoCargo;
        nivelAcesso = novoNivelAcesso;

        System.out.println("--- Após atualização ---");
        System.out.printf("Nome: %s\n" +
                "Cargo: %s\n" +
                "Nível de acesso: %s", nome, cargo, nivelAcesso);
    }
}
