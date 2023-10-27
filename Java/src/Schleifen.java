import java.util.Random;

public class Schleifen {
    public static void main(String[] args) {
        int zahlen[] = {12, 323, 32, 532, 12, 12};

        for (int i = 0; i < zahlen.length; i++) {
            System.out.println(zahlen[i]);

        }

        //foreach can+t change value
        //greift nicht dirket auf werte zu,erstellt nur Kopien von Werten
        for (int zahl : zahlen) {

            if (zahl < 20) {
                System.out.println("skip");
                continue; //
            }
            System.out.println(zahl);

        }

        for (int zahl : zahlen) {

            if (zahl == 32) {
                System.out.println("stop");
                break;
            }
            System.out.println(zahl);

        }

        Random ran = new Random();
        while (true) {
            int zahl = ran.nextInt(10);
            if (zahl == 6) {
                System.out.println("sechs" + zahl);
                break;
            }
            System.out.println(zahl);
        }


        //############################################## Label ####################################################
        // Labels sind in Jave veraltet

        loop:
        while (true)  //ist ein Label
        {
            while (true) {
                int zahl = ran.nextInt(10);
                if (zahl == 6) {
                    System.out.println("sechs" + zahl);
                    break loop; //würde ohne das Label Lopp nur die inner Schleife abbrechen und danach im endlos loop festecken
                }
                System.out.println(zahl);
            }
        }

        System.out.println("switch");
        for (int i = 0; i < 20; i++) {
            int zahl = ran.nextInt(6)+1;
            switch (zahl) {
                case 1:
                    System.out.println("eins" + zahl);
                    break; // ohne break würde alle cases danach auch ausgeführt
                case 2:
                    System.out.println("zwei" + zahl);
                    break;
                case 3:
                    System.out.println("drei" + zahl);
                    break;
                case 4:
                    System.out.println("vier"+ zahl);
                    break;
                case 5:
                    System.out.println("fünf" + zahl);
                    break;
                default: // wenn keins der anderen cases funktioniert
                    System.out.println("müsste ne sechs sein" + zahl);
            }

        }



    }
}
