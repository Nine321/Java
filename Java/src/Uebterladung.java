public class Uebterladung {


    public static void main(String[] args){
        //Überladung
        // Mehrere Methoden, gleicher Name, unterschiedliche Parameter
        //wird oft bei Konstruktoren benutzt

        int zahl1 = 34;
        int zahl2 = 345;
        addieren(3,4);
        addieren(2,4,67);
    }
    //gleiche methoden aber unterschiedliche Paramter (sonst dürften die nicht gleich heißen
    public static void addieren(int zahl1, int zahl2){
        System.out.println(zahl1+ zahl2);
    }

    public static void addieren(int zahl1, int zahl2, int zahl3){
        System.out.println(zahl1+ zahl2 + zahl3);
    }
}
