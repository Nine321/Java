public class KlassenObject1 {

    //Attribute
    int alter;
    String art;
    String fellfarbe;
    boolean kannPfoteGeben;

    //Konstruktor
    // brauch kein Rückgabetyp, weiß dadruch das es Kontstruktor ist, weil kein Rückagbetyp da
    //muss wie Klasse heißen
    public KlassenObject1(int alter, String art, String fellfarbe, boolean kannPfoteGeben){
        //aus Klasse   aus Parameter
        this.alter  = alter;
        this.art = art;
        this.fellfarbe = fellfarbe;
        this.kannPfoteGeben = kannPfoteGeben;

    }



    //Methoden

    public static void bellen() {
        System.out.println("bellen");
    }

    public void testBellen(){
        bellen(); //kann andere Methoden einfach aufrufen
    }

    public void kannBellen(boolean kannBellen){
        if(kannBellen){
            bellen();

        }
    }

    public void rechnen(int zahl1, int zahl2){
        int sum = zahl2 + zahl1;

        System.out.println(sum);
    }
}
