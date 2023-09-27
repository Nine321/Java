import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        logische Operatoren
        System.out.println("! NICHT");
        System.out.println("&&  AND");
        System.out.println("||  OR");
        System.out.println("^   XOR(nicht beides gleich) ");

//        Scanner
        Scanner scan = new Scanner(System.in);
        System.out.println("Gibt eine Zahl ein");
        int zahl= scan.nextInt();
        System.out.println(zahl);

        System.out.println("Gibt ein Satz ein");
        String satz = scan.nextLine();
        System.out.println(satz);
    }
}