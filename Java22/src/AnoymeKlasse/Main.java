package AnoymeKlasse;

public class Main {
    public static void main(String[] args) {
        //Was ist eine anoyme KLasse?
        //Namelose klasse, die gleichzeitig deklariert und initialisert wird
        //gibt zwei wege um anoyme Klasse zu erstellen

        //1. Klasse erweitern

        Katze katze = new Katze();
        katze.macheMiau();

        Katze katze2 = new Katze() { //das ist eine anonyme Klasse, erweiter die Katze Klasse um macheMiau Methode
            public void macheMiau() { //überschreibt Methode von KLasse
                System.out.println("wuff");
            }
        };
        katze2.macheMiau();
        katze.macheMiau();

        //2. Interface implementieren
        Lebewesen lebewesen = new Lebewesen() {
            @Override
            public void macheEtwas() {
                System.out.println("lalala");
            }
        };

        lebewesen.macheEtwas(); // ist ein objekt der anoymn Klasse, kein objekt vom Interface, da man keine Objekte vom Interface erstellen kann



        //##################################
        rufeMethodeAuf(lebewesen);


        //kann direkt in Klammern anoyme Klasse erstellen
        rufeMethodeAuf(new Lebewesen() {
            @Override
            public void macheEtwas() {
                System.out.println("lalala");
            }
        });
    }


    public static void rufeMethodeAuf(Lebewesen lebewesen){
        lebewesen.macheEtwas();
    }
}
