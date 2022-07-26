import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {



        ContoCorrente contoCorrente = new ContoCorrente("Mario", "Rossi");
        System.out.println("Buongiorno " + contoCorrente.getNome() + " " + contoCorrente.getCognome());
        contoCorrente.versamenti();contoCorrente.versamenti();
        contoCorrente.versamenti();
        contoCorrente.prelievi();
        contoCorrente.prelievi();
        contoCorrente.stampaMovimenti();
    }

}
