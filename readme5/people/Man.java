package happyFamily.readme5.people;

import happyFamily.readme5.enums.DayofWeek;
import happyFamily.readme5.enums.HumanActivity;

import java.util.List;
import java.util.Map;

public class Man extends Human {

    public Man(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Man(String name, String surname, int age, int iq) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.iq = iq;
    }

    public Man(String name, String surname, int year, int iq, Map<DayofWeek, List<HumanActivity>> schedule) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.iq = iq;
        this.schedule = schedule;
    }

    public Man() {
    }

    public void repairCar() {
        System.out.println("I'm repairing the car");
    }

    @Override
    protected void finalize() {
        System.out.println("Object of Man is deleted");
    }
}
