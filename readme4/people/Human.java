package happyFamily.readme4.people;

import happyFamily.readme4.animals.Pet;
import happyFamily.readme4.enums.DayofWeek;
import happyFamily.readme4.enums.HumanActivity;

import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Human {
    protected String name;
    protected String surname;
    protected int year;
    protected int iq;
    protected Map<DayofWeek, List<HumanActivity>> schedule;
    protected Family family;


    public Human(String name, String surname, int year, int iq) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
    }

    public Human(String name, String surname, int year, int iq, Map<DayofWeek, List<HumanActivity>> schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
    }

    public Human() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public Map<DayofWeek, List<HumanActivity>> getSchedule() {
        return schedule;
    }

    public void setSchedule(Map<DayofWeek, List<HumanActivity>> schedule) {
        this.schedule = schedule;
    }

    public Family getFamily() {
        return family;
    }

    public void setFamily(Family family) {
        this.family = family;
    }

    public boolean feedPet(boolean isTime, Pet pet) {
        if (isTime) {
            System.out.printf("Hm... I will feed %s \n", pet.getNickname());
            return true;
        } else {
            int a = (int) (Math.random() * 100);
            if (pet.getTrickLevel() > a) {
                System.out.printf("Hm... I will feed %s \n", pet.getNickname());
                return true;
            } else {
                System.out.printf("I think %s is not hungry. \n", pet.getNickname());
                return false;
            }

        }
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, surname, year, iq, family);
        result = 31 * result + Objects.hash(schedule);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        return this.hashCode() == obj.hashCode();
    }

    @Override
    protected void finalize() {
        System.out.println("Object of Human is deleted");
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", year=" + year +
                ", iq=" + iq +
                ", schedule=" + schedule.toString() +
                '}';
    }
}
