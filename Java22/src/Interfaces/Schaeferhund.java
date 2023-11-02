package Interfaces;

public class Schaeferhund implements HundInterface{
    @Override
    public void bellen() {
        System.out.println("Bell Schäfer");
    }

    @Override
    public void fresse() {
        System.out.println("Essen Schäfer");

    }
}
