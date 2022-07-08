package at.bbrz.schule;

public class Lehre extends Angestellter {

    public Lehre(String vorname, String nachName, int age, int persId, float gehald) {
        super(vorname, nachName, age, persId, gehald);
    }

    @Override
    public String toString() {
        return "Lehre{ \n" +"\t"+ super.toString()+"}";
    }
}
