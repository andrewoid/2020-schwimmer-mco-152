package schwimmer.earthquakes;

import com.google.gson.Gson;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import schwimmer.weather.CurrentWeather;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class GetCurrentEarthquakes {

    public static void main(String[] args) {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://earthquake.usgs.gov/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        EarthquakeService service = retrofit.create(EarthquakeService.class);


        List<Integer> integerList = new ArrayList<Integer>();


        service.getThisMonth().enqueue(new Callback<CurrentEarthquakes>() {
            @Override
            public void onResponse(Call<CurrentEarthquakes> call,
                                   Response<CurrentEarthquakes> response) {

                CurrentEarthquakes currentEarthquakes = response.body();
                for (CurrentEarthquakes.Feature feature : currentEarthquakes.features) {
                    System.out.println(feature.properties.toString());
                }

            }

            @Override
            public void onFailure(Call<CurrentEarthquakes> call, Throwable t) {
                t.printStackTrace();
            }
        });

    }

}
