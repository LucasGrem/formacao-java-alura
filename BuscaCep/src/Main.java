//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ConsultaCep consulta = new ConsultaCep();

        try {
            Endereco novoEndereco = consulta.buscaEndereco("01001000");
            System.out.println(novoEndereco);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println("Finalizando a aplicação...");
        }
    }
}