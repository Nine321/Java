package override;

//public abstract class Fahrzeug
// abstract würde dafür sorgenm dass man von der KLasse kein Objekt mehr erstellen kann
public class Fahrzeug {



    int geschwindigkeit = 80;

    public void fahre() {
        System.out.println("Fahrzeug Klasse-super");
    }
    public int getGeschwindigkeit(){
        return this.geschwindigkeit;
    }

    @Override
    public String toString(){ //Überschreibt die toString Methode vom Object
        return "Das ist  toString";
    }

}

