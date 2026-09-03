package ControleTarefas;

public class Main {
    public static void main(String[] args) {
        Tarefa t1 = new Tarefa();
        Tarefa t2 = new Tarefa();
        t1.descricao = "Estudar Java";
        t1.status = false;

        t2.descricao = "Fazer exercícios";
        t2.status = true;

        t1.exibirTarefa();
        t2.exibirTarefa();

    }
}
