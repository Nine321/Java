package Interfaces;

public class Labrador implements HundInterface {
    int alter;
    String name;
    String farbe;


    public Labrador(int alter, String name, String farbe) {
        this.alter = alter;
        this.name = name;
        this.farbe = farbe;
    }

    @Override
    public void bellen() {
        System.out.println("Wuff Labr ");
    }


    @Override
    public void fresse() {
        System.out.println("essen Lab");
    }
}
