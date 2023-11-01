public class staticMain {
    //Static = Objekt Unabhängigkeit

    int value = 10;
    static int value2 = 20;

    public static void main(String[] args)
    {
//        System.out.println(value);
        System.out.println(value2);

        staticKlasse.schnurre();
//        Main.main();

        staticKlasse katze = new staticKlasse();
        staticKlasse katze2 = new staticKlasse();
        katze.getFarbe2();
        katze2.getFarbe2();
        katze.setFarbe2("Lila"); //ändert die Farbe für die ganze Klasse(für alle Objekte der Klasse)
        katze.getFarbe2();
        katze2.getFarbe2();


        //Klasse :farbe = Weiß
         //-> Objekte haben die Farbe auch und haben die macht auch die Farbe zu ändern

    }
}
