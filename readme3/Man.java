package happyFamily.readme3;

import java.util.Arrays;
import java.util.Objects;

public class Man extends Human{

        private String name;
        private String surname;
        private int year;
        private int iq;
        private String[][] schedule;
        private Family family;


        public Man(String name, String surname, int year, int iq) {
            this.name = name;
            this.surname = surname;
            this.year = year;
            this.iq = iq;
        }

        public Man(String name, String surname, int year, int iq, String[][] schedule) {
            this.name = name;
            this.surname = surname;
            this.year = year;
            this.iq = iq;
            this.schedule = schedule;
        }

        public Man() {
        }

        static {
            System.out.println("Human class is being loaded");
        }

        {
            System.out.println("Object of Human is created");
        }

        public void repairCar(){
            System.out.println("I'm repairing the car");
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
                    ", schedule=" + Arrays.deepToString(schedule) +
                    '}';
        }
}
