package schwimmer.weather;

import com.google.gson.Gson;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

public class GetCurrentWeather {

    public static void main(String[] args) throws IOException {

        URL url = new URL("https://samples.openweathermap.org/data/2.5/weather?zip=10019,us&appid=b6907d289e10d714a6e88b30761fae22");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        InputStream in = connection.getInputStream();
        BufferedReader reader = new BufferedReader(new InputStreamReader(in));

        Gson gson = new Gson();
        CurrentWeather currentWeather = gson.fromJson(reader, CurrentWeather.class);

        System.out.println(currentWeather.name);

    }

}
