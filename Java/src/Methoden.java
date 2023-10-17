public class Methoden {

    public static void main(String [] args) {

        print();

        rechne(2,3);
    }

    public static void print(){
        System.out.println("lala");
    }



    public static void rechne(int zahl1, int zahl2){
        int sum = zahl1 + zahl2;
        System.out.println(sum);
    }
}

