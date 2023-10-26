public class GetterSetter {
    private int alter;
    private String name;
    private String geheimnis;




    public GetterSetter(int  alter, String name, String  geheimnis){
        this.name = name;
        this.geheimnis = geheimnis;
        this.alter = alter;
    }
    public int getAlter(){
        return alter;
    }
    public String getGeheimnis(){
        return geheimnis;
    }
    public String getName(){
        return name;
    }

    public void SetAlter(int alter){
        this.alter = alter;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setGeheimnis(String geheimnis) {
        this.geheimnis = geheimnis;
    }


}
