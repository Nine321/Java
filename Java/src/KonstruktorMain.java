public class KonstruktorMain {

    public static void main(String[] args){
        KonstruktorKunde kunde = new KonstruktorKunde(); //falls man vielleicht nur bestimmte Methoden aufrufen möchte
        KonstruktorKunde kunde1 = new KonstruktorKunde("Ben", 56);
        KonstruktorKunde kunde2 = new KonstruktorKunde("Liselotte", 12, "email","Telefon");



        //gibt für Lebewesen und Pfanzen je ein Konstrukter ohne Übergabewerte, mit nur ein sysout Pfanze bzw Lebewesen
        VererbungPfanze pfanze = new VererbungPfanze(); // gibt jetzt zuerste Lebewese aus und dann PFanze, da zuerste auf die geerbte Klasse zu gegriffen wird und dann auf die eigentliche Klasse

        VererbungPfanze pfanze1 = new VererbungPfanze(123, 23.2, true);

        System.out.println(pfanze1.alter);

        VererbungBaum baum = new VererbungBaum(123,412.2,false,100);
        System.out.println(baum.groesse);

    }
}
