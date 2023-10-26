public class ReturnValue {

    public static void main(String[] args) {
        System.out.println(plusRechnen(1, 3));

        int summe = plusRechnen(22, 3); //muss int sein, weil rückgabewert ist int

        KlassenObject1 hunde = hunderstellen(1);
        KlassenObject1 hunde2 = hunderstellen(2);
        KlassenObject1 hunde3 = hunderstellen(3);

        KlassenObject1 hunde4 = hunderstellen(6); //erstellt viele ähnliche Hunde
    }

    public static int plusRechnen(int zahl1, int zahl2) {
        int summe = zahl1 + zahl2;
        return summe;
    }
    public static KlassenObject1 hunderstellen(int alter){ //erstellt ein Objekte das immer den gleichen hund erstellt nur mit anderen Alter:
        return new KlassenObject1(alter, "Puddel", "grey", true);
    }
}