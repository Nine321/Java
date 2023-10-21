public class KlassenObjecteMain {

    public static void main(String[] args){

        //################ before Konstruktor ####################
    KlassenObject1.bellen(); // kann darauf zu greifen, weil die Methode in der andern klasse public und static ist
        //muss also nicht extra erste ein obejct davon erzeugt werden, weil static


//        KlassenObject1 hund = new KlassenObject1(); // erzeugt ein neues Object von Datentyp KlassenObject1

//        hund.bellen(); //geht aber auch mit neuen Object
//
//        hund.rechnen(2,4);
//
////        KlassenObject1.rechnen(3.2); // geht jetzt nicht ohne erst ein Object zu erstellen,
//        //da Methode in anderen KLasse nicht static ist
//
//        hund.testBellen(); //bellt auch weil die bellen Methoden darin aufgerufen wird

        //########################## after Konstruktor #####################################

        KlassenObject1 labrador = new KlassenObject1(3,"Labdrabdor", "braun", true);

        KlassenObject1 dackel = new KlassenObject1(4,"Dackel", "rot", true);

        System.out.println(labrador.alter);

        KlassenObject1 [] hunde = {labrador, dackel}; //Array mit Objekten

        for (int i = 0; i < hunde.length; i++) {
            System.out.println(hunde[i].art); //gibt alle Arten von Hunden aus aus array

        }
    }
}
