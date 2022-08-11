package patPerson;

import java.util.ArrayList;

public class PersonSort {
    public static void filter(ArrayList<Person> personList,Proverka<Person> proverka){
        for (Person p: personList){
            if (proverka.test(p)) System.out.println(p);
        }
    }
}
