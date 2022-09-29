package project.weather.forecast;


import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import project.weather.forecast.IpmaCityForecast; //may need to adapt package name
import project.weather.forecast.IpmaService;
public class App 
{
    

    private static Logger logger = LogManager.getLogger(App.class);
    private static int CITY_ID_AVEIRO; //1010500 -> Aveiro

    public static void  main(String[] args ) {

		logger.debug("Debug Message Logged !!!");
		logger.info("Info Message Logged !!!");
		logger.error("Error Message Logged !!!", new NullPointerException("NullError"));
	    
        for (String arg : args){
            CITY_ID_AVEIRO = Integer.parseInt(arg);
        }

        // get a retrofit instance, loaded with the GSon lib to convert JSON into objects
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.ipma.pt/open-data/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        // create a typed interface to use the remote API (a client)
        IpmaService service = retrofit.create(IpmaService.class);
        // prepare the call to remote endpoint
        Call<IpmaCityForecast> callSync = service.getForecastForACity(CITY_ID_AVEIRO);

        try {
            Response<IpmaCityForecast> apiResponse = callSync.execute();
            IpmaCityForecast forecast = apiResponse.body();

            if (forecast != null) {
                CityForecast firstDay = forecast.getData().listIterator().next();
                
                System.out.printf( "max temp for %s is %4.1f %n",
                        firstDay.getForecastDate(),
                        Double.parseDouble(firstDay.getTMax()));
            } else {
                System.out.println( "No results for this request!");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}
