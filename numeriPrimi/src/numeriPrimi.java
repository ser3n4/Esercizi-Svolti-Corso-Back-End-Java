import java.util.Scanner;

public class numeriPrimi {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci un numero");
        int a = input.nextInt();
        numeroPrimo(a);
    }

    private static boolean numeroPrimo(int a) {

        if (a / 1 == a && a / a == 1) {

            if (a == 1 || a % 2 == 0 ^ a == 2) {
                System.out.println("Non e' primo");
            } else
                System.out.println("E'primo");
        }
        return true;
    }
}
