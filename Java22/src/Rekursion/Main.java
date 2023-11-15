package Rekursion;

public class Main {
    public static void main(String[] args){
//        helloWorld();//wird solange ausgerufen bis es System Fehler wird Endlosschleife

        heydu(10);

    }
    public static void helloWorld(){
        System.out.println("Hello World");
        helloWorld();
    }

    public static void heydu(int counter){
        if (counter == 0){
            System.out.println("Fertig");
        } else {
            System.out.println("Hey Du");
            heydu(counter -1);
        }
    }
}
