package client;


public class Main {

    public static void main(String[] args) {

        System.out.println("Weather for Gdańsk: ");
        System.out.println("------------------------------");
        System.out.println(WeatherDisplayer.showWeatherFor("Gdańsk"));
        System.out.println("Weather for Gdynia: ");
        System.out.println("------------------------------");
        System.out.println(WeatherDisplayer.showWeatherFor("Gdynia"));

    }
}


