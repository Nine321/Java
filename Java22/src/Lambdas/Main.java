package Lambdas;

public class Main {
    public static void main(String[] args) {
        //Functional Interfaces
        //Lambda Ausdruck = Abkürzung, um eine Implementierung eines Functional Interfaces zu definieren

//        Lebewesen lebewesen = new Lebewesen(); // geht nicht weil man vom Interface keine Klasse erstellen kann
        Lebewesen lebewesen = new Lebewesen() {
            @Override //muss dan nicht extra eine neue Klasse erstellen die das Interface implementiert
            public void macheEtwas() {
                System.out.println("lalal");
            }
        };


        //das ist ein Lambda ausdruck
        Lebewesen benjamin = () -> System.out.println("Töro"); // kann man von Oben abkürzen

        benjamin.macheEtwas();


        Lebewesen benjamin22 = () -> System.out.println("Törrrö");

        benjamin22.macheEtwas();


        //######################### Lambdas mit übergabe wert #################

        Lebewesen2 tier2 = (String v) -> System.out.println( v + "lalal"); //gilt nur für  tier2
        tier2.macheEtwas("Das tier sagt:"); //gilt nur für  tier2

        // kann  man noch mehr abkürzen

        Lebewesen2 tier3 = v -> System.out.println(v + "oink");
        tier3.macheEtwas("Tier drei sagt ");

        Lebewesen2 tier4 = vorher -> System.out.println(vorher + "maiu"); //kann hier auch namen von Übergabeparameter ändern
        tier4.macheEtwas("Tier vier sagt ");


        //################### Lambdas mit mehrer Übergabewerten #######################

                                //muss in Klammern wenn mehr als 1 Parameter
        Lebewesen3  lebewesen3 = (vor, nach) -> System.out.println(vor + "blub "+ nach);
        lebewesen3.macheEtwas("vorher ", 2);


        Lebewesen3  lebewesen4 = (vor, nach) -> System.out.println(vor + "blub "); //muss nicht alle Parameter hier verwenden
        lebewesen4.macheEtwas("vorher2 ", 2312);


        //############### Lambdas mit Rückgabewert #######################
        Lebewesen4  lebewesen5 = (vor, nach) -> {
            return nach + "blub " + nach;  //kann anscheind auch gleichen parameter doppelt verwenden. Reihenfolge ist auch egal
        };// müssen geschweifte Klammern drum wenn nicht in einer zeile

        String test = lebewesen5.macheEtwas("vorher ", "aswerf");

        System.out.println(test);


        //kann man auch wieder auf eine zeile kürzen, brauch kein return schlüsselwort und dann in einer Zeile wieder keine klammern
        Lebewesen4  lebewesen6 = (vor, nach) -> nach + "blub " + nach;

        String test2 = lebewesen6.macheEtwas("vorher ", "aswerf");

        System.out.println(test);

    }
}
