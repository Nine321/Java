package Interfaces;

public class Main {
    public static void main(String[] args){
        Labrador molly = new Labrador(1,"Susi", "braun");
        Dackel bruno = new Dackel();
        Schaeferhund senta = new Schaeferhund();

        HundInterface fred = new Labrador(3,"fred","lila");
        HundInterface fredD = new Dackel();
        HundInterface fredS = new Schaeferhund();

        HundInterface[] hunde ={fred,fredD,fredS};

        for (HundInterface hund : hunde) {
            System.out.println(hund.getClass().toString());
            hund.bellen();
            hund.fresse();
        }
       
    }
}
