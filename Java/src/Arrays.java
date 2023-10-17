import java.util.Random;

public class Arrays {
    public static void main(String[] args) {


        String [] arrayWort= {"Haus", "Baum", "Apfel"};

        System.out.println(arrayWort[1]);
        System.out.println(arrayWort.length);

        int[] arrayZwei = new int[3];
        arrayZwei[0] = 1;
        arrayZwei[1] = 2;
        arrayZwei[2] = 3;


        int [] arrDrei = new int[10];

        Random ran = new Random();


        for (int i = 0; i < arrDrei.length; i++) {
            int zahl = ran.nextInt(10);
            arrDrei[i] = zahl;

        }
        int sum = 0;
        for (int i : arrDrei) {
            System.out.println(i);

            sum += i;
        }
        System.out.println(sum + " Ergebnis");
    }
}
