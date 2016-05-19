package meteo;

import org.springframework.stereotype.Service;

/**
 * Created by mdautrey on 13/10/15.
 */
@Service public class WeatherService implements WeatherInterface {

    private static final String URI = "http://api.openweathermap.org/data/2.5/weather?q=%s,%s&APPID=%s";
    private static final String APIKey = "752d34ff4a7f1cd4ed111512b0c6276a";


    public final WeatherForecast getWeatherForecast(Location location) {
        //RestTemplate restTemplate = new RestTemplate();
        //restTemplate.getMessageConverters().add(new MappingJackson2HttpMessageConverter());
        //String url = String.format(URI, location.getCodeVille(), location.getCodePays(), APIKey);
        //WeatherForecast weatherForecast = restTemplate.getForObject(url, WeatherForecast.class);
        WeatherForecast weatherForecast = new WeatherForecast();
        weatherForecast.setName("Test du câblage");
        return weatherForecast;
    }
}