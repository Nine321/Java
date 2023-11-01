public class VererbungPfanze extends VererbungsLebewesen{ //erweitert von VererbungsLebewesen Klasse
    boolean hatNadeln;

    public VererbungPfanze(){
        System.out.println("Pflanze Konstruktor");
    }
//    public VererbungPfanze(int alter, double groesse, boolean hatNadeln){ //kann auch Parameter verwenden, die in Klassee von der geerbt wird, verwenden
//        this.alter= alter;
//        this.groesse = groesse;
//        this.hatNadeln = hatNadeln;
//
//
//    }
    public VererbungPfanze(int alter, double groesse, boolean hatNadeln){ //kann auch Parameter verwenden, die in Klassee von der geerbt wird, verwenden
        super(alter, groesse); //kommt aus geerbten Klasse
        this.hatNadeln = hatNadeln;


    }




}
