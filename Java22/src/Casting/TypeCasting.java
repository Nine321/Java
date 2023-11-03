package Casting;

public class TypeCasting {

    public static void main(String[] args) {
//        int a = 0.5; wouldn´t work because its a double
        int a = (int) 0.5; //Casting 0.5 in an int ans just cuts everything thats behind the the komma up

        int b = (int) 0.6;

        System.out.println(a);
        System.out.println(b);


        // byte -> short -> int -> long -> float -> double      geht ohne Casting

        //double-> float -> long -> int -> short -> byte        brauch Casting


    }
}
