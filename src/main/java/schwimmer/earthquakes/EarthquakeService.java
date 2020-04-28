package schwimmer.earthquakes;

import retrofit2.Call;
import retrofit2.http.GET;

public interface EarthquakeService {

    @GET("earthquakes/feed/v1.0/summary/significant_month.geojson")
    Call<CurrentEarthquakes> getThisMonth();

    @GET("earthquakes/feed/v1.0/summary/significant_week.geojson")
    Call<CurrentEarthquakes> getThisWeek();

}
