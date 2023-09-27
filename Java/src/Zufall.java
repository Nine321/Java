import java.util.Random;

public class Zufall {
    public static void main(String[] args) {

        Random random = new Random();
        int zahl = random.nextInt();
        System.out.println(zahl);

        zahl = random.nextInt(10); //0-9
        System.out.println(zahl);

        zahl = random.nextInt(6) +1 ; //1-6
        System.out.println(zahl);

        String letter = "abcdefghijklmnopqrstuvwxyz";
        String word ="";
        for (int i = 0; i < 5 ; i++) {
            int stelle =random.nextInt(26);
            word += letter.charAt(stelle);

        }
        System.out.println(word);
    }
}
