package Interfaces;

public class Dackel implements HundInterface {
    private int beine = 4;
    int alter;
    private String name;
    int gewicht;
    @Override
    public void bellen() {
        System.out.println("Dackel bell");
    }

    @Override
    public void fresse() {
        System.out.println("Dackel iss");

    }
}
