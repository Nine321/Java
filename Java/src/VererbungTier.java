public class VererbungTier extends VererbungsLebewesen { //erweitert von VererbungsLebewesen Klasse
    boolean kannFliegen;

    String gerausch;
    public VererbungTier(){

    }
//    public VererbungTier(int alter, double groesse, boolean kannFliegen, String gerausch){ //kann auch Parameter verwenden, die in Klassee von der geerbt wird, verwenden
//        this.alter= alter;
//        this.groesse = groesse;
//        this.kannFliegen = kannFliegen;
//        this.gerausch = gerausch;
//    }

    public VererbungTier(int alter, double groesse, boolean kannFliegen, String gerausch){
       super(alter,groesse); //greift auf den Konstruktor von der geerbten Klasse wieder, dann muss man das nicht in der geerbten Klasse schreiben
        this.kannFliegen = kannFliegen;
        this.gerausch = gerausch;
    }
}
