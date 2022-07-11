import java.util.Random;

public class MathRandom {

    public static void main(String[] args) {
    double  valore_random = Math.random();
    int valore_pescato = (int) (valore_random * 100);
    System.out.println(valore_pescato);

    //creo oggetto random
    Random random = new Random();
    //tramite metodo next int posso dare un bound, in questo caso
    //numeri da 1 a 5
    int dado = random.nextInt(1,6);
    System.out.println(dado);
    //booleano random
        boolean monetina = random.nextBoolean();
        if(monetina){
            System.out.println("TESTA");
        }else{
            System.out.println("CROCE");
        }

    }

}
