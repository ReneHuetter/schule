package at.bbrz.schule;
public class Angestellter extends Person{
    private int persId;
    private float gehald;
    public Angestellter(String vorname, String nachName, int age, int persId, float gehald) {
        super(vorname, nachName, age);
        this.persId = persId;
        this.gehald = gehald;
    }
    public int getPersId() {
        return persId;
    }
    public void setPersId(int persId) {
        this.persId = persId;
    }
    public float getGehald() {
        return gehald;
    }
    public void setGehald(float gehald) {
        this.gehald = gehald;
    }
    @Override
    public String toString() {
        return "Angestellter{" +
                "persId=" + persId +
                ", gehald=" + gehald +
                "} " + super.toString();
    }
}
