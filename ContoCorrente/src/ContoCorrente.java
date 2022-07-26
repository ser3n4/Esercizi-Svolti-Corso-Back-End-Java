import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ContoCorrente {

    //attributi
    private String nome;
    private String cognome;
    private double saldo;
    private int denaro;
    private double saldoFinale;
    Scanner input = new Scanner(System.in);
    private int[] ListaMovimenti;
    private int conteggioMovimenti;

    //costruttore
    public ContoCorrente(String nome, String cognome) {
        this.saldo = 1000;
        this.saldo = saldo;
        this.denaro = denaro;
        this.conteggioMovimenti = 0;
        this.nome = nome;
        this.cognome = cognome;
        this.ListaMovimenti = new int [5];
    }
    //metodi
    public double versamenti() {
        System.out.println("Inserisci l' importo da versare: ");
        denaro = input.nextInt();
        System.out.println("Hai effettuato un versamento di " + denaro + " Euro");
        saldoFinale = saldo + denaro;
        System.out.println("Adesso tuo saldo e' " + saldoFinale + " Euro");
        ListaMovimenti[conteggioMovimenti++] = denaro;
        orarioMovimenti();
        return denaro;
    }

    public double prelievi() {
        System.out.println("Inserisci importo da prelevare");
        denaro = input.nextInt();
        System.out.println("Hai deciso di prelevare  " + denaro + " Euro");
        saldoFinale -= denaro;
        System.out.println("Adesso tuo saldo e' " + saldoFinale + " Euro");
        ListaMovimenti[conteggioMovimenti++] = -denaro;
        orarioMovimenti();
        return denaro;
    }

    /*public double effettuaPrelievo(double importoPrelievc){
        this.saldo -= importoPrelievo;
        return importoPrelievc;
    }*/

    /*public double effettuaVersamento(double importoVersamento){
        this.saldo += importoVersamento;
        return this.saldo;
    */

    public void stampaMovimenti() {
        System.out.println("Ecco la lista dei tuoi ultimi 5 movimenti");
        for (int i = 0; i < ListaMovimenti.length; i++) {
            System.out.println(ListaMovimenti[i]);
        }
    }
        public String getNome(){
            return nome;
        }
        public String getCognome(){
            return cognome;
        }

        public void orarioMovimenti(){
            DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yy/MM/dd HH:mm:ss");
            System.out.println("data e ora " +  dtf2.format(LocalDateTime.now()));
        }





}