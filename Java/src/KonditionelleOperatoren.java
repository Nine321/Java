public class KonditionelleOperatoren {
    public static void main(String[] args)
    {
        //Konditionelle Operatoten

        String satz ="Hallo Computer";

        if(satz.startsWith("Hallo")){
            System.out.println("Hey");
        }else {
            System.out.println("nein");
        }

        //boolean(Bedingung)? (wahr): (falsch);
        //kann aber nur Variablen, Datentype  wiedergeben und keine Methoden ausführen !!!

        //müssen die gleichen rückgabe Datentype sein
        String antwort = satz.startsWith("Hallo")? "Hey":"Nein";

        System.out.println(antwort);



        //########################
        int i  = 4;

        System.out.println(i < 4? "kleiner als 4": i >4? "Größer als 4": "Gleich 4" );
        //              boolean?     true      false/boolean?   true    false





    }
}
