package at.bbrz.schule;

import java.util.ArrayList;
import java.util.List;

public class Schule {
    private List<Schueler> schuelerListe = new ArrayList<>();
    private List<Angestellter> angestellterList = new ArrayList<>();

    public Schule(Lehre lehre, Schueler schueler) {
        this.angestellterList.add(lehre);
        this.schuelerListe.add(schueler);
    }
    public void add(Schueler schueler){
        schuelerListe.add(schueler);
    }
    public void add(Lehre lehre){
        angestellterList.add(lehre);
    }
    public void add(Vertragsbedienste vertragsbedienste){
        angestellterList.add(vertragsbedienste);
    }
    public List<Lehre> getLeher () {
        ArrayList<Lehre> leherList = new ArrayList();
        for(Angestellter angestellter : angestellterList) {
            if (angestellter instanceof Lehre) {
                leherList.add((Lehre) angestellter);
            }
        }
        return leherList;
    }
    public List<Vertragsbedienste> getVertragsbedienste () {
        ArrayList<Vertragsbedienste> vertragsbediensteList = new ArrayList<>();
        for(Angestellter angestellter : angestellterList) {
            if (angestellter instanceof Vertragsbedienste) {
                vertragsbediensteList.add((Vertragsbedienste) angestellter);
            }
        }
        return vertragsbediensteList;
    }
    @Override
    public String toString() {
        return "Schule { " + "\n" +
                "angestellter = " + angestellterList + "\n" +
                ", schueler = " + schuelerListe + "\n" +
                '}';
    }
}
