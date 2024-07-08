import com.google.gson.Gson;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;



public class Solicitud {

    public Conversion nuevoTipoCambio(String monedaOrigen) {
        //Dirección de la API
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/fe1bc47b9e820b52241a95ca/latest/" + monedaOrigen);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion) //La misma dirección definidia arriba
                .build();
        try {
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            return new Gson().fromJson(response.body(), Conversion.class);
        } catch (Exception e) {

            throw new RuntimeException("No jaló esta vaina");
        }
    }
}



