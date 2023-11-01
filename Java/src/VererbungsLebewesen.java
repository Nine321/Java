public class VererbungsLebewesen {
    int alter;
    double groesse;


    public VererbungsLebewesen(){
        System.out.println("Lebewesen Konstruktor");
    }
    public VererbungsLebewesen(int alter, double groesse){
        this.alter= alter;
        this.groesse = groesse;
    }
    public void fortPflanzen(){
        System.out.println("Kann sich Fortpfanzen");
    }
    public void wachsen(){
        this.groesse++;
    }
}
