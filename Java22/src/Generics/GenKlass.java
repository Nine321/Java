package Generics;

//für ein Generic wird in der Regel einfach nur T geschrieben
public class GenKlass<T,K> { //muss Generic schon hier definieren wenn man darauf in der Gruppe zugreifen möchte

    T objekt;
    K objekt22;

    public GenKlass(T objekt, K objekt22){
        this.objekt = objekt;
        this.objekt22 = objekt22;
    }
    public T getObjekt(){ //getter mit Generic
        return objekt;
    }

    public void setObjekt(T neuesObjekt){ //setter mit Generic
        this.objekt = neuesObjekt;
    }
    public K getObjekt22(){ //getter mit Generic
        return objekt22;
    }

    public void setObjekt22(K neuesObjekt){ //setter mit Generic
        this.objekt22 = neuesObjekt;
    }
}
