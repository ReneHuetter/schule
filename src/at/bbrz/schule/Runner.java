package at.bbrz.schule;

public class Runner {

    public static void main(String[] args) {

        Person walter = new Person();
        walter.setVorname("Walter");
        walter.setNachName("Max");
        walter.setAge(26);
        System.out.println(walter);

        System.out.println(walter.getVorname());

        Person ines = new Person("Ines","Hubert",18);
        System.out.println(ines);

        Schueler klaus = new Schueler();
        klaus.setVorname("Klaus");
        klaus.setNachName("Stein");
        klaus.setAge(7);
        System.out.println(klaus);

        Schueler paula = new Schueler("Paula", "Wiesen",19,219);
        System.out.println(paula);

        Person hans = new Schueler("Hans","Wald",19, 218);
        System.out.println(hans);

        Schueler hans2 = (Schueler) hans;
        System.out.println(hans2.getSchuelerId());

        ((Schueler)hans).getSchuelerId();
        System.out.println(hans.fullName());

        Angestellter peter = new Angestellter("Peter","Wolf",32, 8332, 1.450f);
        System.out.println(peter);
        System.out.println(peter.fullName());

        Person wolf = new Angestellter("Wolfgang","Müller", 82,1982, 2.598f);
        System.out.println(wolf);
        Angestellter wolf2 = (Angestellter) wolf;
        System.out.println(wolf2.fullName());

        Schule schule = new Schule(wolf2,paula);
        System.out.println(schule);
    }

}
