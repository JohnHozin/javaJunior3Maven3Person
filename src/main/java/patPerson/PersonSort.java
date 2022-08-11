package patPerson;

import java.util.ArrayList;

public class PersonSort {
    public static void filter(ArrayList<Person> personList, Proverka<Person> proverka) {
        for (Person p : personList) {
            if (proverka.test(p)) System.out.println(p);
        }
    }

    public static void filterCountry(ArrayList<Person> personList, Proverka<Person> proverka) {
        for (Person p : personList) {
            if (proverka.test(p)) System.out.println(p);
        }
    }

    public static void filterCity(ArrayList<Person> personList, Proverka<Person> proverkaCity, int proverkaCount) {
        for (Person p : personList) {
            for (int i = 0; i < proverkaCount; i++) {
                if (proverkaCity.test(p)) System.out.println(p);
            }
        }
    }
}
