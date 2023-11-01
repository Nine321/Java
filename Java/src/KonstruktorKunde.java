public class KonstruktorKunde {
    String name;
    int alter;
    String email;
    String telefon;

    public KonstruktorKunde(){ //um vielleicht auf etwas zugreifen zu können ohne das parameter übergevben werden

    }
    public KonstruktorKunde(String name, int alter){ //Kann gleiche Konstruktor mit unterschiedlichen ÜbergabeParameter erstellen
        this.name = name;
        this.alter = alter;

    }
    public KonstruktorKunde(String name, int alter, String email, String telefon){
        this.name = name;
        this.alter = alter;
        this.email = email;
        this.telefon = telefon;


    }


}
