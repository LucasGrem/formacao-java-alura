import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Atividades {
    public static void main(String[] args) {
        LocalDate dataAtual = LocalDate.now();
        LocalTime horaAtual = LocalTime.now();

        DateTimeFormatter dataAtualFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter horaAtualFormatada = DateTimeFormatter.ofPattern("HH:mm");

        String dataFormatada = dataAtual.format(dataAtualFormatada);
        String horaFormatada = horaAtual.format(horaAtualFormatada);

        System.out.println("Data formatada: " + dataFormatada);
        System.out.println("Hora formatada: " + horaFormatada);
    }
}
