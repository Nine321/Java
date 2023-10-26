public class GetterSetterMain {
    public static void main(String[] arg){


        GetterSetter newPerson = new GetterSetter(23,"Hans","Streng geheim");
        System.out.println(newPerson.getAlter());
        System.out.println(newPerson.getName());
        System.out.println(newPerson.getGeheimnis());

        newPerson.setGeheimnis("neues geheimnis");
        System.out.println(newPerson.getGeheimnis());

    }
}
