import java.util.Scanner;

public class contaOccorrenza {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci una stringa");
        String s = input.next();
        System.out.println("Inserisci un carattere");
        char c = input.next().charAt(0);
        contaOccorrenza(c,s);
    }

    static int contaOccorrenza(char c, String s) {

        int contatore = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c)
                contatore++;
        }
        System.out.println("il numero di caratteri contenuto nella stringa è " + contatore);

        return contatore;

    }

}//class
