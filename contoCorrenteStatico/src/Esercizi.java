public class Esercizi {

    //Es. 3.1: scrivere un programma che costruisca un conto bancario, versi in esso
    //$1000, prelevi da esso $500, prelevi altri $400 e infine visualizzi il saldo
    //rimanente

    public static void main(String[] args){
        //istanzio oggetto di una classe
        //che deve prendere il nome della classe
        Esercizi Correntista = new Esercizi();

        //deposito
        Esercizi.deposito(800);
        Esercizi.prelievo(150);
        Esercizi.prelievo(100);

    }

    private static double conto;

// si costruisce un conto bancario con saldo uguale a zero

    public static void contoBancario(){
        double conto = 0;
    }
/* si costruisce un conto bancario con un saldo assegnato
 @param initialBalance il saldo iniziale*/

    public static void contoBancario(double saldo){
        double conto = saldo;
    }

    /* si versa denaro nel conto bancario
     @param amount l'importo da versare*/

    public static void deposito (double deposit){
        conto += deposit;
        System.out.println("Versamento sul conto di euro a titolo di stipendio " + deposit);
    }

    //si preleva denaro dal conto

    public static void prelievo (double preliev){
        conto -= preliev;
        System.out.println("Si preleva per pagamento delle bollette e della spesa " + preliev);

    }

    public double getsaldocontoBancario(){

        return conto;

    }

     //si calcola un interesse sul conto
    public static void calcolaTasso(double tasso, double conto){

        conto = conto + (conto *tasso)/ 100;
    }

}

