package at.bbrz.schule;

public class Vertragsbedienste extends Angestellter{

    public Vertragsbedienste(String vorname, String nachName, int age, int persId, float gehald) {
        super(vorname, nachName, age, persId, gehald);
    }

    @Override
    public String toString() {
        return "Vertragsbedienste { \n" +"\t"+super.toString()+"}";
    }
}
