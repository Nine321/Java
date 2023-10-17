public class KlassenObjecteMain {

    public static void main(String[] args){

    KlassenObject1.bellen(); // kann darauf zu greifen, weil die Methode in der andern klasse public und static ist
        //muss also nicht extra erste ein obejct davon erzeugt werden, weil static


        KlassenObject1 hund = new KlassenObject1(); // erzeugt ein neues Object von Datentyp KlassenObject1

        hund.bellen(); //geht aber auch mit neuen Object

        hund.rechnen(2,4);

//        KlassenObject1.rechnen(3.2); // geht jetzt nicht ohne erst ein Object zu erstellen,
        //da Methode in anderen KLasse nicht static ist

    }
}
