package Generics;

public class Main2 {
    public static void main(String[] args){
        GenKlass generic = new GenKlass(123,"3123");

        generic.setObjekt(123);
        System.out.println(generic.getObjekt());

        generic.setObjekt("asdf");
        System.out.println(generic.getObjekt());

        GenKlass <String, Double> genString = new GenKlass<>("asdf",12.31);
//        genString.setObjekt(1321);
        
        genString.setObjekt("243fas");
        System.out.println(genString.getObjekt());
    }
}
