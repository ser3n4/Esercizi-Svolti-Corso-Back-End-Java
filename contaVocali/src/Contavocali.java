import java.util.Locale;
import java.util.Scanner;

public class Contavocali {

    //• Scrivete un programma che data una parola stampa a schermo il numero di vocali e
    //consonanti presenti.
    //• Modificate il programma in modo che funzioni con una frase data. (usate le
    //funzioni).

    public static void vocaliConsonantiParola(String s) {
        //rendo la stringa tutta con lettere minuscole
        s = s.toLowerCase();
        int vocali = 0;
        int consonanti = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vocali++;
            } else {
                consonanti++;
            }

        }
        System.out.println("Il numero di vocali nella parola è " + vocali);
        System.out.println("Il numero di consonanti nella parola è " + consonanti);
    }

    public static void vocaliConsonantiFrasi(String s) {
        s = s.toLowerCase();
        int vocali = 0;
        int consonanti = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            //classe Character rappresenta un carattere
            //metodo is letter torna true se carattere è una lettera
            if (Character.isLetter(c)) {

                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vocali++;
                } else {
                    consonanti++;
                }
            }
        }
        System.out.println("Il numero di vocali nella parola è " + vocali);
        System.out.println("Il numero di vocali nella parola è " + consonanti);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci una parola");
        String parola = input.nextLine();
        vocaliConsonantiParola(parola);
        System.out.println();
        System.out.println("Inserisci ora una frase");
        String frase = input.nextLine();
        vocaliConsonantiFrasi(frase);
    }

}




