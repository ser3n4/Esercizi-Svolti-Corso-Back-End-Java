import java.util.Scanner;
public class palindroma {
    /* Il metodo Main chiederà all'utente di inserire la
     * parola/frase o sequenza di numeri da controllare dopo di che
     * chiamerà il metodo statico isPalindroma che restituirà
     * il valore true se l'input inserito dall'utente è palindromo,
     * false altrimenti */
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.println("Inserire parola/frase/numeri da controllare se sia Palindroma:");
        String word = in.nextLine();
        boolean isPalindroma = isPalindroma(word);
        if(isPalindroma){
            System.out.println("La parola/frase/numeri '"+word+"' è Palindrima");
        }else{
            System.out.println("La parola/frase/numeri '"+word+"' NON è Palindrima");
        }
    }
    /*
    Metodo statico
    public static boolean isPalindroma(String word)
    che data una variabile di tipo string chiamata 'word' restituisca
    un valore booleano vero se e solo se 'word' e' palindroma
    falso altrimenti. Una stringa e' palindroma se
    può essere letta da sinistra verso destra e da destra verso
    sinistra indifferentemente (es. "anna", "ailatiditalia", ecc.).
    */
    public static boolean isPalindroma(String word) {
        if(word == null)
            return false;
/*Trasformo le lettere della parola/frase tutte in
minuscolo ed elimino tutti gli spazi*/
        word = word.toLowerCase().replaceAll("\\s", "");
//Se la parole è di un solo carattere allora sarà sicuemente palindroma
        if(word.length() < 2)
            return true;
        boolean palindroma = true;
        int startIndex = 0;
        int endIndex = word.length()-1;
/* Uso due indici uno che parte dalla prima posizione e verrà
incrementato di uno ad ogni iterazione e un'altro indice che parte
dall'ultima posizione della frase e verrà decrementato di uno
ad ogni iterazione*/
        for(; startIndex < endIndex; startIndex++, endIndex-- ) {
/* Ad ogni iterazione controllo i due valori che si
trovano nelle posizioni puntate dai due indici.
Se sono diversi il contenuto di 'word' non sarà palindroma */
            if(word.charAt(startIndex) != word.charAt(endIndex)) {
                palindroma = false;
                break;
            }
        }
        return palindroma;
    }
}