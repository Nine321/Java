public class VererbungMain {

    public static void main(String[] args) {
        VererbungsLebewesen lebewesen = new VererbungsLebewesen();
//        lebewesen.groesse; //kann jetzt darauf zugreifen, (wenn in größe ein wert hinterlegt wäre
        lebewesen.fortPflanzen();

        VererbungPfanze pfanze = new VererbungPfanze();
//        pfanze.groesse; //kann jetzt auch auf größe zugreifen, ob in Lebenwesen deklariert wird, weil pfanze davon erbt
        pfanze.fortPflanzen();

        VererbungTier tier = new VererbungTier();
//        tier.groesse;
        tier.fortPflanzen();


        //Datentyp                      woraus neues Objekt erstellt wird
        VererbungsLebewesen tier2 = new VererbungTier(); //geht auch so rum, wenn man die Klasse aus der man erbt als Datentyp nimmt
        tier2.fortPflanzen();
    }


}
