public class VererbungBaum extends VererbungPfanze{
    int wurzel;
    public VererbungBaum(int alter, double groesse, boolean hatNadeln, int wurzel){
        super(alter, groesse,hatNadeln);//alles Parameter die vom Konstruktor VererbungPfanze geerbt werden
        this.wurzel = wurzel;

    }
}
