package override;

public class Main {
    public static void main(String[] args) {
        Auto auto = new Auto();
        auto.fahre();

        Traktor traktor = new Traktor();
        traktor.fahre();

        Fahrzeug auto2 = new Auto();
        auto2.fahre();  // gibt ein Fehler wenn die fahren Methode nicht in Fahrzeug wäre
        //gibt aber trotzdem die Methode aus Auto wieder weil die dort überschrieben wird
        //kann aber nur dinge überschreiben, die in der geerbten KLasse sind
        //auskommentieren in Auto is okay da dann einfach auf die fahren Methode von geerbter Klasse zugegriffen wird


        System.out.println(auto2.getGeschwindigkeit());


        Fahrzeug fahrzeug = new Fahrzeug();
        System.out.println(fahrzeug.toString());


//##############################################################
        //gibt mit der Überschreibung immer mindestens eine version der fahren Methode


        System.out.println("######################################");
        Fahrzeug fahrzeug1= new Fahrzeug();
        Fahrzeug auto3 = new Auto();
        Fahrzeug traktorF = new Traktor();

        Fahrzeug[] fahrzeuge ={fahrzeug1, auto3,traktorF};

        for (int i = 0; i < fahrzeuge.length; i++) {
            fahrzeuge[i].fahre();
        }


        System.out.println("######################################");
        Fahrzeug fahrzeug5= new Fahrzeug();
        Auto auto5 = new Auto();
        Traktor traktor5 = new Traktor();

        Fahrzeug[] fahrzeuge1 ={fahrzeug5, auto5,traktor5};

        for (int i = 0; i < fahrzeuge.length; i++) {
            fahrzeuge1[i].fahre();
        }






    }

}
