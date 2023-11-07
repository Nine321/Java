package Collection.Listen;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        int [] prime = new int[3];
        prime[0] =1;
        prime[1] =8;
        prime[2] =4;

        //Array wie Feste Box mit größe, die man im nachhinein nicht mehr verändern kann
        //Liste wie Kette wo man immer wieder neue Elemente hinzufügen kann
        //Collection.Listen sind dafür aber langsamer und arbeiten nicht so schnell wie arrays
        //in Liste kann man Datenntypen mischen

        ArrayList primeNumberList= new ArrayList<>();
        primeNumberList.add(2);
        primeNumberList.add(8);
        primeNumberList.add(2);
        primeNumberList.add(4);
        primeNumberList.add("String");

        ArrayList<Integer>zahlList = new ArrayList<Integer>();  //kann den zweiten Datentyp hin
        zahlList.add(3);
//        zahlList.add("String");  geht jetzt nicht, weil nur Integer rein dürfen


        List<Integer> listeZahl = new ArrayList<>();
        listeZahl.add(7);
        listeZahl.add(5);
        listeZahl.add(78);


        listeZahl.remove(2); //welcher index gelöscht werden soll

        System.out.println(listeZahl.contains(3));// contains überprüft ob wert in Liste enthalten ist (true/false)

        System.out.println(listeZahl.get(1));

        for (Integer integer : listeZahl) {
            System.out.println(integer);

        }

        for (int i = 0; i < primeNumberList.size(); i++) {
            System.out.println(primeNumberList.get(i));
        }



        //#########################################################
        List<String> einkaufsliste = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        boolean mehreinkauf = true;
        while (mehreinkauf){
            System.out.println("Mehr einkaufen? J/N");
            String s = scan.next();
            if (s.equals("J") ){
                System.out.println("was soll eingekauft werden?");
                String einkauf = scan.next();
                einkaufsliste.add(einkauf);
            }else {
                mehreinkauf = false; //würde auch mit ein break gehen und einfach true in while schleife
                for (String s2 : einkaufsliste) {
                    System.out.println(s2);
                }
            }
        }




    }
}
