package patPerson;

import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.ZonedDateTime;
import java.util.ArrayList;

public class ApiPerson {
    public ArrayList<Person> getApiPersonFromRequest(int col) throws IOException, InterruptedException {

        ArrayList<Person> persons = new ArrayList<>();

        for (int i = 0; i < col; i++) {
            HttpClient httpClient = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.
                    create("https://randomuser.me/api")).build();
            HttpResponse<String> response = httpClient.send(request,
                    HttpResponse.BodyHandlers.ofString());

            persons.add(parcePersonRespon(response.body()));
        }
        return persons;
    }

    public Person parcePersonRespon(String response) {
        Person person = new Person();

        JSONObject fullData = new JSONObject(response).
                getJSONArray("results").getJSONObject(0);
        person.setGender(fullData.getString("gender"));
        person.setFirstName(fullData.getJSONObject("name").getString("first"));
        person.setLastName(fullData.getJSONObject("name").getString("last"));
        person.setEmail(fullData.getString("email"));
        person.setCountry(fullData.getJSONObject("location").getString("country"));

        ZonedDateTime zonedDateTime = ZonedDateTime.parse(fullData.getJSONObject("dob").
                getString("date"));
        person.setDob(zonedDateTime.toLocalDateTime());
        person.setCity(fullData.getJSONObject("location").getString("city"));

        return person;
    }
}