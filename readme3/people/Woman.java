package happyFamily.readme3.people;

import java.util.Arrays;

public class Woman extends Human {

    public Woman(String name, String surname, int year, int iq) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
    }

    public Woman(String name, String surname, int year, int iq, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
    }

    public Woman() {
    }

    static {
        System.out.println("Human class is being loaded");
    }

    {
        System.out.println("Object of Human is created");
    }

    public void makeup() {
        System.out.println("I'm doing makeup");
    }

    @Override
    protected void finalize() {
        System.out.println("Object of Human is deleted");
    }

    @Override
    public String toString() {
        return "Woman{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", schedule=" + Arrays.deepToString(schedule) +
                '}';
    }
}
