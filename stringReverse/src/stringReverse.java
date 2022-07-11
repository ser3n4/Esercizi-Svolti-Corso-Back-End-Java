import java.util.Scanner;

public class stringReverse {

    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Inserisci una stringa");
        String s = input.next();
        char[] c = s.toCharArray();
        String text = "";
        stringReverse(s,c,text);
    }
    static void stringReverse(String s, char[] c, String text){

        for(int i = s.length()-1; i>=0; i--){
            text = text + c[i];

        }
        System.out.println("Stringa al contrario: " + text);

    }

}
