package Casting;

public class Main {
    public static void main(String[] args){
        //Casting in Rahmen mit Klassen meint immer auch vererbung
        //Upcast:Subklasse -> Superklasse (verallgemeinern)
        //Downcast: Superklasse -> Subklasse (spezialisieren)
        //Polymorphie (Vorteil von Upcast???)

        Person person = new Person();
        Schueler schueler = new Schueler();

        Person schueler1 = new Schueler(); //Upcast (haben Schüler verallgemeinert)
        //ist für Programm jetz nur wie eine Person, nicht wie ein Schueler

        schueler.rechnen(); //die Methode hat schüler eins jetzt nicht mehr
        schueler1.gehen(); //hat nur noch die Methoden und Attribute aus der Personen klasse


        Schueler schueler2 = (Schueler) schueler1; //Downcast versicherung an programm das es sich wirklich im Schueler handelt
        schueler2.rechnen();

//        Schueler schueler3= (Schueler) person; //gibt ein Fehler person wirklich personen ist als Datentyp & Objekt oder so
            //Downcast der nicht gültig ist


        Person oberstufenschueler = new OberstufenSchueler();
//        OberstufenSchueler person2 = (OberstufenSchueler) new Person();
            // geht nicht wäre wie wenn man sich eine Person auf Straße aussucht und sagt die soll jetzt einfach Oberstufen Schüker sein

//##################################################
        System.out.println("###########################################");

        Person lehrer = new Lehrer();
        Person schueler4 = new Schueler();
        Person schueler5 = new Schueler();


        Person[] personen ={lehrer, schueler4, schueler5};

        for (int i = 0; i < personen.length; i++) {
            personen[i].gehen();
        }

    }
}
