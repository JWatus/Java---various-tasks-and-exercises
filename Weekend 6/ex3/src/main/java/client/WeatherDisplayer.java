package client;

import model.StateObject;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.time.LocalDate;
import java.time.LocalTime;


@RequestScoped
public class WeatherDisplayer {

    public static String showWeatherFor(String town) {

        Client client = ClientBuilder.newClient();

        WebTarget webTarget = client.target("http://openweathermap.org/data/2.5/weather?q="
                + town
                + "&appid=b6907d289e10d714a6e88b30761fae22&unit=metric");

        Response response = webTarget.request().accept(MediaType.APPLICATION_JSON_TYPE).get();
        StateObject restResponse = response.readEntity(StateObject.class);
        response.close();

        StringBuilder builder = new StringBuilder();

        builder.append("Date: ");
        builder.append(LocalDate.now());
        builder.append("</br>");
        builder.append("Time: ");
        builder.append(LocalTime.now());
        builder.append("</br>");
        builder.append("</br>");

        builder.append("Main: ");
        builder.append(restResponse.getWeather().get(0).getMain());
        builder.append("</br>");
        builder.append("Description: ");
        builder.append(restResponse.getWeather().get(0).getDescription());
        builder.append("</br>");
        builder.append("Wind speed: ");
        builder.append(restResponse.getWind().getSpeed());
        builder.append(" [m/s]");
        builder.append("</br>");

        builder.append("Temperature: ");
        builder.append(restResponse.getMain().getTemp());
        builder.append(" [°C]");
        builder.append("</br>");
        builder.append("Min. temp: ");
        builder.append(restResponse.getMain().getTempMin());
        builder.append(" [°C]");
        builder.append("</br>");
        builder.append("Max. temp: ");
        builder.append(restResponse.getMain().getTempMax());
        builder.append(" [°C]");
        builder.append("</br>");
        builder.append("Humidity: ");
        builder.append(restResponse.getMain().getHumidity());
        builder.append(" [%]");
        builder.append("</br>");
        builder.append("Pressure: ");
        builder.append(restResponse.getMain().getPressure());
        builder.append(" [hPa]");
        builder.append("</br>");

        String weather = builder.toString();

        return weather;
    }
}
