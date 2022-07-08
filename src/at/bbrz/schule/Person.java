package at.bbrz.schule;
public class Person {
    private String vorname;
    private String nachName;
    private int age;
    public Person(String vorname, String nachName, int age) {
        this.vorname = vorname;
        this.nachName = nachName;
        this.age = age;
    }
    public Person() {
    }
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }
    public void setNachName(String nachName) {
        this.nachName = nachName;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getVorname() {
        return vorname;
    }
    public String getNachName() {
        return nachName;
    }
    public int getAge() {
        return age;
    }
    public String fullName() {
        return vorname + " " + nachName;
    }
    @Override
    public String toString() {
        return "Person { " +"\n" +
                "\tvorname = '" + vorname + '\'' +
                "\n \tnachName = '" + nachName + '\'' +
                ",\n \tage = " + age +
                "\n \t}"+"\n";
    }
}
