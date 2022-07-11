import java.util.Arrays;
import java.util.Scanner;

public class Minigoogle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci dimensione array");
        int d = input.nextInt();
        int[] arrayNumber = new int[d];
        int n;
        boolean flag = false;
        for (int i = 0; i < arrayNumber.length; i++) {

            System.out.println("Inserisci un numero per riempire l'array");
            arrayNumber[i] = input.nextInt();
        }
        System.out.println("L'array e' composto da " + Arrays.toString(arrayNumber));

        System.out.println("Inserisci un numero ");
        n = input.nextInt();

        for (int i = 0; i < arrayNumber.length; i++) {

            if (n == arrayNumber[i]) {
                flag = true;
                System.out.println("Il numero " + n + " e' presente nell'array");
            }
        }

        if(flag==false) {
            System.out.println("Valore non presente");
        }
    }

}

//2 tipi di for per array
//for per indice dove base in cui ciclo è per indice
//serve per riempire array,

//per raccogliere gli elementi array (e non serve indice)
//uso for each