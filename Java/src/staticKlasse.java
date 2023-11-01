public class staticKlasse {

    private String farbe;
    private static String farbe2  ="Weiß"; //Static Werte sind praktisch für Werte die für die ganze Klasse gelten soll, also auch für alle Objekte der Klasse
    private int alter;

    public static void schnurre() { // kann man jetzt aufrufen ohne vorher ein objekt zu erstellen, da methode static ist
        System.out.println("schnurren");
    }

    public void getFarbe2(){
        System.out.println(farbe2);
    }
    public void setFarbe2(String farbe2){
        this.farbe2= farbe2;
    }
}
