package patPerson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

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


        return person;
    }
}