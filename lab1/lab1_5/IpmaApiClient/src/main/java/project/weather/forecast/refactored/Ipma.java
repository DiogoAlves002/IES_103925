package project.weather.forecast.refactored;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import project.weather.forecast.refactored.CityForecast;
import project.weather.forecast.refactored.IpmaCityForecast; //may need to adapt package name
import project.weather.forecast.refactored.IpmaService;

public class Ipma 
{

    private static Logger logger = LogManager.getLogger(Ipma.class);
    private static String CITY_NAME;

    public static String main(String city)
    {
        String CITY_NAME = city.toLowerCase();


        // get a retrofit instance, loaded with the GSon lib to convert JSON into objects
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.ipma.pt/open-data/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

                
        Map<String, Integer> cities = new HashMap<>();
        IpmaService service = retrofit.create(IpmaService.class);
        Call<IpmaCityForecast> callSync = service.getCityID();

        try {
            Response<IpmaCityForecast> apiResponse = callSync.execute();
            IpmaCityForecast forecast = apiResponse.body();

            for (CityForecast c : forecast.getData()) {
                String local = c.getLocal().toLowerCase();
                int id = c.getGlobalIdLocal();
                cities.put(local, id);
            }

            if (cities.containsKey(CITY_NAME)) {
                retrofit = new Retrofit.Builder()
                        .baseUrl("http://api.ipma.pt/open-data/")
                        .addConverterFactory(GsonConverterFactory.create())
                        .build();

                service = retrofit.create(IpmaService.class);
                String CITY_ID = city.toLowerCase();
                callSync = service.getForecastForACity(cities.get(CITY_ID));


                try {
                    apiResponse = callSync.execute();
                    forecast = apiResponse.body();
                    if (forecast != null) {
                        logger.info( "max temp for today: " + forecast.getData().listIterator().next().getTMax());
                        return "max temp for today: " + forecast.getData().listIterator().next().getTMax();
                    } else {
                        logger.info("No results!");
                        return  "No results!";
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
            else {
                logger.info("No results!");
                return "No results!";
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return "No results!";

    }
}
