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
            if (proverkaCity.test(p)) {
                if (proverkaCount > 0) {
                    System.out.println(p);
                    proverkaCount--;
                } else {
                    proverkaCount=0;
                }
            }

        }
        if (proverkaCount > 0){
            System.out.println("Недостаточно людей, проживающих в данном городе");
        }
    }
}
