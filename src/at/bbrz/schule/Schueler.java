package at.bbrz.schule;
public class Schueler extends Person {
    private int schuelerId;
    public Schueler(String vorname, String nachName, int age, int schuelerId) {
        super(vorname, nachName, age);
        this.schuelerId = schuelerId;
    }
    public Schueler() {
    }
    public int getSchuelerId() {
        return schuelerId;
    }
    public void setSchuelerId(int schuelerId) {
        this.schuelerId = schuelerId;
    }
    @Override
    public String toString() {
        return "Schueler{" +
                "schuelerId=" + schuelerId +
                "} " + super.toString();
    }
}
