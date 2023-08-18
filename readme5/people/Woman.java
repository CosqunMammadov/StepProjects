package happyFamily.readme5.people;

import happyFamily.readme5.enums.DayofWeek;
import happyFamily.readme5.enums.HumanActivity;

import java.util.List;
import java.util.Map;

public class Woman extends Human {

    public Woman(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Woman(String name, String surname, int age, int iq) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.iq = iq;
    }

    public Woman(String name, String surname, int age, int iq, Map<DayofWeek, List<HumanActivity>> schedule) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.iq = iq;
        this.schedule = schedule;
    }

    public Woman() {
    }

    public void makeup() {
        System.out.println("I'm doing makeup");
    }

    @Override
    protected void finalize() {
        System.out.println("Object of Human is deleted");
    }
}
