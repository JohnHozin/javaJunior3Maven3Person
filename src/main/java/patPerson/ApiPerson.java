package patPerson;

import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.ZonedDateTime;

public class ApiPerson {
    public Person getApiPersonFromRequest() throws IOException, InterruptedException {
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.
                create("https://randomuser.me/api")).build();
        HttpResponse<String> response = httpClient.send(request,
                HttpResponse.BodyHandlers.ofString());

        return parcePersonRespon(response);
    }

    public Person parcePersonRespon(HttpResponse<String> response){
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



        return person;
    }
}