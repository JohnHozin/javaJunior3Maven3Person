package patPerson;

import java.time.LocalDateTime;
import java.util.Objects;

public class Person {
    private String gender;
    private String firstName;
    private String lastName;
    private String country;
    private String email;
    private LocalDateTime dob;

    private String city;

    public Person() {
    }

    public Person(String gender, String firstName, String lastName, String country, String email, LocalDateTime dob) {
        this.gender = gender;
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.email = email;
        this.dob = dob;
    }

    public Person(String gender, String firstName, String lastName, String country, String email, LocalDateTime dob, String city) {
        this.gender = gender;
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.email = email;
        this.dob = dob;
        this.city = city;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getDob() {
        return dob;
    }

    public void setDob(LocalDateTime dob) {
        this.dob = dob;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(gender, person.gender) && Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(country, person.country) && Objects.equals(email, person.email) && Objects.equals(dob, person.dob) && Objects.equals(city, person.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(gender, firstName, lastName, country, email, dob, city);
    }

    @Override
    public String toString() {
        return "Person{" +
                "gender='" + gender + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", country='" + country + '\'' +
                ", email='" + email + '\'' +
                ", dob=" + dob +
                ", city='" + city + '\'' +
                '}' + "\n";
    }
}