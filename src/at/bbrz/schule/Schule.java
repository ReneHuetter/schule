package at.bbrz.schule;

import java.util.ArrayList;
import java.util.List;

public class Schule {
    private List<Schueler> schuelerListe = new ArrayList<>();
    private List<Angestellter> angestellterList = new ArrayList<>();

    public Schule(Angestellter angestellter, Schueler schueler) {
        this.angestellterList.add(angestellter);
        this.schuelerListe.add(schueler);
    }
    public void add(Schueler schueler){
        schuelerListe.add(schueler);
    }
    public void add(Angestellter angestellter){
        angestellterList.add(angestellter);
    }
    @Override
    public String toString() {
        return "Schule{" +
                "angestellter=" + angestellterList +
                ", schueler=" + schuelerListe +
                '}';
    }
}
