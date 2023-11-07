package Collection.Set;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args){
        //in Set gibt es keine Elemente doppelt
        //Set: 2,3,6,10
        //Liste: 2,2,2,3,3,6,10,10

        Set<Double> set = new HashSet<>();
        set.add(1.0);
        set.add(1.0);
        set.add(1.5);
        set.add(1.6);
        set.add(2.5);//add methode gibt ein boolean zurück, ob das Element hinzugefügt wurden konnte oder nicht
        set.add(2.5);//gibt die doppelte Elemente nicht wieder
        System.out.println(set.add(5.0)); // gibt ein true aus, weil 5.0 hinzugefügt werden kann


        System.out.println(set);//doppelte Elemente wurden nur einmal hinzugefügt

        set.remove(2.5);

        System.out.println(set.isEmpty()); //gibt ein Boolean zurück, wenn set leer ist
        System.out.println(set.size()); //gibt die größe vom Set zurück
        System.out.println(set.contains(1.6)); //gibt ein Boolean zurück ob Element enthalten ist


        //set auslesen geht nur mit foreach da es in Set KEINE INDEX gibt (also geht for i nicht)
        // Reihenfolge im Set ist egal
        // gibt auch keine get und setter

        for (Double d : set) {
            System.out.println(d);
        }


        //######################## zweite Methode um Sets zu erstellen #####################

        Set immutableSet = Set.of(3.2, 23.7,2.3,4.5); // ist danach wie in Stein gemeiselt, kann danach nichts hinzufügen oder löschen oder verändern
//        immutableSet.add(3.4); gibt eine Fehlermeldung
        //ist immutable = also nicht veränderbar

        System.out.println(immutableSet);


        set.addAll(Set.of(3.8, 23.0,2.9,4.8)); //übergibt alle Werte den set Set und fügt die dort hinzu
        set.addAll(immutableSet); // macht das gleiche

        System.out.println(set);



        //##################################
        System.out.println("#####################");
        Set<String> tiere = new HashSet<>();
        tiere.add("katze");
        tiere.add("katze");
        tiere.add("Maus");
        tiere.add("Tiger");
        tiere.add("Fuchs");

        for (String s : tiere) {
            System.out.println(s);
        }
        System.out.println("######################");
        Set<Tiere> tiere2 = new HashSet<>();
        tiere2.add(new Tiere("katze")); //Katze wird 2mal ausgeben, da jedes mal ein neues Objekt erzeugt wird und nur die übergabewerte gleich sind
        tiere2.add(new Tiere("katze"));
        tiere2.add(new Tiere("Tiger"));
        tiere2.add(new Tiere("Maus"));

        for (Tiere tiere1 : tiere2) {
            System.out.println(tiere1.getArt());
            System.out.println(tiere1); //  ist immer ein andere Objekt hat nur gleiche Attribute
        }






    }
}
