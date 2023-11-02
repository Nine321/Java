package override;

public class Auto extends Fahrzeug {
    int geschwindigkeit = 120;

//muss zum überschreiben den gleichen Methoden Namen und Rückgabewert haben & die gleichen ÜbergabeParameter

    @Override //zeigt das diese MEthode der superklasse überschreibt (gibt ein Fehler wenn zb Methoden namen ,.. für überschreibung falsch ist
    public void fahre() {
//        super.fahre();//um die Fahren Methode von Superklasse(geerbte Klasse) auszugeben
        System.out.println("Auto Klasse");
    }
    //gibt also erst inhalt aus superklassen MEthode fahren aus und dann den rest aus der Methode fahren




//    @Override   //Überschreibt nicht da ein ander übergabe Parmeter hat
    public void fahre(int i){
        System.out.println("Auto mit int" + i);
    }


//    public int getGeschwindigkeit(){
//        return this.geschwindigkeit; //gibt eigenen Geschwindigkeit zurück
//    }
public int getGeschwindigkeit(){
    return super.geschwindigkeit; // gibt die Geschwindigkeit von superKlasse zurück
}
}
