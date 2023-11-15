package Rekursion;

public class Main2 {
    public static void main(String[] args){
        //Fakultät 5! = 5 * 4 * 3 * 2 * 1
        //gleiche wie 5!= 5 * 4! = 4 * 3! ...

        System.out.println(fakultaet(5));
    }
    public static int fakultaet(int zahl){
        if (zahl == 1) {
            return 1;
        }
        return zahl * fakultaet(zahl - 1);
    }
}
