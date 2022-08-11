package patPerson;

import java.util.ArrayList;
import java.util.Scanner;

public class MainDZ {
    public static void main(String[] args) {
        // сделать сортировку по country (вывод страны, которую ввели)

        // сделать метод который по числу и городу возвращает данное
        // количество людей из этого города


        ApiPerson apiPerson = new ApiPerson();
        ArrayList<Person> persons = new ArrayList<>();
        try {
            persons = apiPerson.getApiPersonFromRequest(50);
            System.out.println(persons);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println();
        System.out.println("Введите страну:");
        Scanner scanner = new Scanner(System.in);
        String country = scanner.nextLine();

        PersonSort.filterCountry(persons, c -> c.getCountry().equals(country));

        System.out.println();
        System.out.println("Введите город:");
        String city = scanner.nextLine();
        System.out.println("Введите количество людей:");
        int countPeople = scanner.nextInt();

        PersonSort.filterCity(persons, d -> d.getCity().equals(city), countPeople);
    }
}
