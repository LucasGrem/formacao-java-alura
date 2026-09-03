package ControleTarefas;

public class Tarefa {
    String descricao;
    boolean status;

    public void exibirTarefa() {
        if (status == true) {
            System.out.println("Tarefa: " + descricao + " - Status: Concluída");
        } else {
            System.out.println("Tarefa: " + descricao + " - Status: Pendente");
        }
    }
}
